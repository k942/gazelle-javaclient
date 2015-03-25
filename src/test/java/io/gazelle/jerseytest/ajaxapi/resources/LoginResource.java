package io.gazelle.jerseytest.ajaxapi.resources;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

@Path("login.php")
public class LoginResource {

	public static final String CORRECT_USERNAME = "blu";
	public static final String CORRECT_PASSWORD = "lawl";

	@POST
	public Response post(@FormParam("username") String username, @FormParam("password") String password) {
		if (validCredentials(username, password)) {
			return Response.ok().cookie(new NewCookie("session", "thisIsSessionCookieContent")).build();
		}
		return Response.status(Status.UNAUTHORIZED).build();
	}

	private boolean validCredentials(String username, String password) {
		return (username.equals(CORRECT_USERNAME) && password.equals(CORRECT_PASSWORD));
	}
}
