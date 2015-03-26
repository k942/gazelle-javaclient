package io.gazelle.jerseytest.ajaxapi.resources;

import io.gazelle.jerseytest.ajaxapi.AjaxResponse;
import io.gazelle.jerseytest.ajaxapi.ResourceLoader;
import io.gazelle.resources.index.Index;

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


		AjaxResponse ajaxResponse = new AjaxResponse();
		ajaxResponse.setStatus("failure");

		if (action.equals("index")) {
			ajaxResponse.setStatus("success");
			Index idx = new Index();
			idx.setUsername("dr4g0n");
			idx.setId(469);
			ajaxResponse.setResponse(idx);
		}
		

		return Response.ok().type(MediaType.APPLICATION_JSON).entity(ajaxResponse).build();
	}
}
