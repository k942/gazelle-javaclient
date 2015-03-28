package io.gazelle.apimock.resources;

import io.gazelle.apimock.utils.AjaxResponse;
import io.gazelle.apimock.utils.DTOProvider;
import io.gazelle.apimock.utils.Secured;
import io.gazelle.dto.Index;

import java.io.IOException;

import javax.annotation.Resource;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

@Path("ajax.php")
@Resource
@Secured
public class AjaxResource {

	private DTOProvider dtoProvider = DTOProvider.INSTANCE;

	@GET
	public Response getAjay(@Context UriInfo info) throws IOException {
		String action = info.getQueryParameters().getFirst("action");

		AjaxResponse ajaxResponse = new AjaxResponse();
		ajaxResponse.setStatus("failure");

		if (action.equals("index")) {
			ajaxResponse.setStatus("success");
			Index index = dtoProvider.setInstance(Index.class);
			ajaxResponse.setResponse(index);
		}

		return Response.ok().type(MediaType.APPLICATION_JSON).entity(ajaxResponse).build();
	}
}
