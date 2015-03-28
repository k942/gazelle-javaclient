package io.gazelle.apimock.resources;

import java.net.URI;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import org.apache.commons.lang.RandomStringUtils;

@Path("login.php")
public class LoginResource {

	public static final String CORRECT_USERNAME = RandomStringUtils.randomAlphanumeric(10);
	public static final String CORRECT_PASSWORD = RandomStringUtils.randomAlphanumeric(40);
	public static final String SESSION_COOKIE = RandomStringUtils.randomAlphanumeric(40);

	@POST
	public Response post(@FormParam("username") String username, @FormParam("password") String password) {
		if (validCredentials(username, password)) {
			return Response.status(Status.FOUND).location(URI.create("http://www.nottobeload.com"))
					.cookie(new NewCookie("session", SESSION_COOKIE)).build();
		}
		return Response.status(Status.UNAUTHORIZED).build();
	}

	private boolean validCredentials(String username, String password) {
		return (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD));
	}
}
