package io.gazelle.jerseytest.ajaxapi.resources;

import io.gazelle.jerseytest.ajaxapi.AjaxResponse;
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

		AjaxResponse ajaxResponse = new AjaxResponse();
		ajaxResponse.setStatus("failure");

		if (action.equals("index")) {
			ajaxResponse.setStatus("success");
			s = ResourceLoader.readJsonStringValueOf(this.getClass().getResourceAsStream("index.json"));
			ajaxResponse.setResponse(s);
		}
		if (action.equals("user")) {
			ajaxResponse.setStatus("success");
			String id = info.getQueryParameters().getFirst("id");
			if (id != null) {
				s = ResourceLoader.readJsonStringValueOf(this.getClass().getResourceAsStream("index.json"));
			}
		}
		if (action.equals("similar_artists")) {
			ajaxResponse.setStatus("success");

				s = ResourceLoader.readJsonStringValueOf(this.getClass().getResourceAsStream("similarartists.json"));
		}
		if (action.equals("artist")) {
			ajaxResponse.setStatus("success");

				s = ResourceLoader.readJsonStringValueOf(this.getClass().getResourceAsStream("artist.json"));
		}

		return Response.ok().type(MediaType.APPLICATION_JSON).entity(ajaxResponse).build();
	}
}
