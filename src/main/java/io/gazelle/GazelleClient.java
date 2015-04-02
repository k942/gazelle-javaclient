package io.gazelle;

import io.gazelle.policies.Policy;
import io.gazelle.utils.ResourceModule;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;

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
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.inject.Guice;
import com.google.inject.Injector;

public class GazelleClient implements RESTClient {

	private static final Logger LOGGER = Logger.getLogger(GazelleClient.class);

	private String username;
	private String password;
	private String gazelleUrl;

	private ObjectMapper objectMapper = new ObjectMapper().setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
	private Client client = ClientBuilder.newClient().register(objectMapper);
	private CookieManager cookieManager = new CookieManager();
	private Optional<HttpCookie> sessionCookie = Optional.empty();

	private Set<Policy> policies = new HashSet<>();

	private GazelleResources resources;

	private WebTarget baseTarget;
	private WebTarget loginTarget;
	private WebTarget ajaxTarget;

	private GazelleClient() {
		// Use factory
		CookieHandler.setDefault(cookieManager);
	}

	/**
	 * Setup the WebTarget according to {@link GazelleClient#gazelleUrl}. 
	 */
	private void setupTargets() {
		baseTarget = client.target(gazelleUrl);
		loginTarget = baseTarget.path("login.php");
		ajaxTarget = baseTarget.path("ajax.php");
		ajaxTarget.register(new GazelleResponseFilter(objectMapper));

		Injector i = Guice.createInjector(new ResourceModule(this, ajaxTarget));
		resources = i.getInstance(GazelleResources.class);
	}

	public static GazelleClient newInstance(String gazelleUrl, String username, String password) {
		GazelleClient gClient = new GazelleClient();
		gClient.setUsername(username);
		gClient.setPassword(password);
		gClient.setGazelleUrl(gazelleUrl);
		return gClient;
	}

	public void close() {
		client.close();
	}

	public void enforce(Policy policy) {
		policies.add(policy);
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

	public WebTarget action(String action) {
		return ajaxTarget.queryParam("action", action);
	}

	public <T> T get(WebTarget target, Class<T> responseType) {
		ensureLogin();
		policies.forEach(p -> p.enforce());
		return target.request(MediaType.APPLICATION_JSON_TYPE).cookie(Cookie.valueOf(sessionCookie.get().getValue()))
				.get(responseType);

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
		this.setupTargets();
	}

	/**
	 * @return the resources
	 */
	public GazelleResources getResources() {
		return resources;
	}

}
