package io.gazelle;

import io.gazelle.policies.WhatcdRequestPolicy;

import java.io.IOException;
import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;
import java.util.Optional;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.Form;
import javax.ws.rs.core.MediaType;

import org.apache.log4j.Logger;
import org.glassfish.jersey.client.ClientProperties;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.databind.AnnotationIntrospector;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.module.jaxb.JaxbAnnotationIntrospector;

public class GazelleClient {

	private static final Logger LOGGER = Logger.getLogger(GazelleClient.class);

	private String username;
	private String password;
	private String gazelleUrl;

	private ObjectMapper objectMapper = new ObjectMapper().setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
	private Client client = ClientBuilder.newClient().register(objectMapper);
	private CookieManager cookieManager = new CookieManager();
	private Optional<HttpCookie> sessionCookie = Optional.empty();

	private WebTarget baseTarget;
	private WebTarget loginTarget;
	private WebTarget apiTarget;

	private GazelleClient() {
		// Use factory
		CookieHandler.setDefault(cookieManager);
		
		AnnotationIntrospector introspector = new JaxbAnnotationIntrospector(objectMapper.getTypeFactory());
		objectMapper.setAnnotationIntrospector(introspector);
	}

	public void setupTargets() {
		baseTarget = client.target(gazelleUrl);
		loginTarget = baseTarget.path("login.php");
		apiTarget = baseTarget.path("ajax.php");
	}

	public static GazelleClient newInstance(String gazelleUrl, String username, String password) {
		GazelleClient gClient = new GazelleClient();
		gClient.setUsername(username);
		gClient.setPassword(password);
		gClient.setGazelleUrl(gazelleUrl);
		gClient.setupTargets();
		return gClient;
	}

	public void close() {
		client.close();
	}

	private void login() {
		LOGGER.info("Logging on website: " + gazelleUrl);
		Form form = new Form();
		form.param("username", username);
		form.param("password", password);

		loginTarget.property(ClientProperties.FOLLOW_REDIRECTS, false);
		loginTarget.request().post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));
		loginTarget.property(ClientProperties.FOLLOW_REDIRECTS, true);

		List<HttpCookie> cookies = cookieManager.getCookieStore().get(URI.create(gazelleUrl));
		sessionCookie = cookies.stream().filter(c -> c.getName().equalsIgnoreCase("session")).findFirst();
	}

	private boolean isLogged() {
		return sessionCookie.isPresent();
	}

	private void ensureLogin() {
		if (!isLogged()) {
			login();
		}
	}

	public <T> T request(String action, Class<T> responseType) {
		ensureLogin();
		WebTarget target = apiTarget.queryParam("action", action);
		return request(target, responseType);
	}

	private <T> T request(WebTarget target, Class<T> responseType) {
		WhatcdRequestPolicy.INSTANCE.enforce();
		String r = target.request(MediaType.APPLICATION_JSON_TYPE).cookie(Cookie.valueOf(sessionCookie.get().getValue()))
		.get(String.class);
		try {
			JsonNode node = objectMapper.readTree(r);
			if (!node.get("status").asText().equals("success")) {
				throw new RuntimeException("Failure");
			}
			return objectMapper.readValue(node.get("response").traverse(), responseType);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getGazelleUrl() {
		return gazelleUrl;
	}

	public void setGazelleUrl(String gazelleUrl) {
		this.gazelleUrl = gazelleUrl;
	}

}
