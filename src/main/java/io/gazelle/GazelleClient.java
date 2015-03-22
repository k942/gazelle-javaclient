package io.gazelle;

import java.net.CookieHandler;
import java.net.CookieManager;
import java.net.HttpCookie;
import java.net.URI;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

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
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;
import com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider;

public class GazelleClient {

	private static final Logger LOGGER = Logger.getLogger(GazelleClient.class);
	private static final int MAX_REQUEST = 5;
	private static final int TIME_LIMIT_SECONDS = 10;

	private volatile int nbRequestInTimeLimit = 0;
	private String username;
	private String password;
	private HttpCookie sessionCookie;
	private String gazelleUrl;

	private JacksonJsonProvider jackson_json_provider = new JacksonJaxbJsonProvider();
	private ObjectMapper blu = jackson_json_provider.locateMapper(Object.class, MediaType.APPLICATION_JSON_TYPE)
			.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
	private Client client = ClientBuilder.newClient().register(jackson_json_provider);
	private CookieManager cookieManager = new CookieManager();

	private WebTarget baseTarget;
	private WebTarget loginTarget;
	private WebTarget apiTarget;

	private GazelleClient() {
		// Use factory
		CookieHandler.setDefault(cookieManager);

		Timer timer = new Timer(true);
		timer.scheduleAtFixedRate(new TimerTask() {
			@Override
			public void run() {
				nbRequestInTimeLimit = 0;
			}
		}, 0, TIME_LIMIT_SECONDS * 1000);
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
		Form form = new Form();
		form.param("username", username);
		form.param("password", password);

		loginTarget.property(ClientProperties.FOLLOW_REDIRECTS, false);
		loginTarget.request().post(Entity.entity(form, MediaType.APPLICATION_FORM_URLENCODED_TYPE));
		loginTarget.property(ClientProperties.FOLLOW_REDIRECTS, true);

		List<HttpCookie> cookies = cookieManager.getCookieStore().get(URI.create(gazelleUrl));
		for (HttpCookie c : cookies) {
			if (c.getName().equalsIgnoreCase("session")) {
				sessionCookie = c;
			}
		}
	}

	private boolean isLogged() {
		return sessionCookie != null;
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
		enforceRequestLimit();
		nbRequestInTimeLimit++;
		return target.request(MediaType.APPLICATION_JSON_TYPE).cookie(Cookie.valueOf(sessionCookie.getValue()))
				.get(responseType);
	}

	private void enforceRequestLimit() {
		while (nbRequestInTimeLimit >= MAX_REQUEST) {
			try {
				LOGGER.info("Refrain from making more than five (5) requests every ten (10) seconds. "
						+ "Sleeping a while (1second), to enforce this rule.");
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				Thread.currentThread().interrupt();
			}
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
