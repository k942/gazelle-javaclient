package io.gazelle.jerseytest.ajaxapi.resources;

import io.gazelle.jerseytest.ajaxapi.ResourceLoader;

import java.io.IOException;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("ajax.php")
public class AjaxResource {

	@GET
	public Response getHello(@Context UriInfo info) throws IOException {
		String action = info.getQueryParameters().getFirst("action");
		String s = null;

		if (action.equals("index")) {
			s = ResourceLoader.readJsonStringValueOf(this.getClass().getResourceAsStream("index.json"));
		}
		if (action.equals("user")) {
			String id = info.getQueryParameters().getFirst("id");
			if (id != null) {
				s = ResourceLoader.readJsonStringValueOf(this.getClass().getResourceAsStream("index.json"));
			}
		}
		return Response.ok().type(MediaType.APPLICATION_JSON).entity(s).build();
	}
}
