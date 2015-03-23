package io.gazelle.jerseytest.resources;

import io.gazelle.GazelleClient;
import io.gazelle.resources.index.Index;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.NewCookie;
import javax.ws.rs.core.Response;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;
import org.junit.Assert;
import org.junit.Test;

public class IndexTest extends JerseyTest {

	@Path("ajax.php")
	public static class HelloResource {

		@GET
		public Response getHello(@QueryParam("action") String action) {
			String s = null;
			if (action.equals("index")) {
				s = "{\n" + " \"status\": \"success\",\n" + " \"response\": {\n" + " \"username\": \"dr4g0n\",\n"
						+ " \"id\": 469,\n" + " \"authkey\": \"redacted\",\n" + " \"passkey\": \"redacted\",\n"
						+ " \"notifications\": {\n" + " \"messages\": 0,\n" + " \"notifications\": 9000,\n"
						+ " \"newAnnouncement\": false,\n" + " \"newBlog\": false\n" + " },\n" + " \"userstats\": {\n"
						+ " \"uploaded\": 585564424629,\n" + " \"downloaded\": 177461229738,\n" + " \"ratio\": 3.29,\n"
						+ " \"requiredratio\": 0.6,\n" + " \"class\": \"VIP\"\n" + " }\n" + " }\n" + "}";
			}
			return Response.ok().type(MediaType.APPLICATION_JSON).entity(s).build();
		}
	}

	@Path("login.php")
	public static class LoginResource {

		@POST
		public Response post() {
			return Response.ok().cookie(new NewCookie("session", "Hello, world!")).build();
		}
	}

	@Override
	protected Application configure() {
		return new ResourceConfig(HelloResource.class, LoginResource.class);
	}

	@Test
	public void test() {
		GazelleClient client = GazelleClient.newInstance("http://localhost:9998", "blu", "lawl");
		Index index = client.request("index", Index.class);
		Assert.assertEquals("dr4g0n", index.getResponse().getUsername());
	}

}
