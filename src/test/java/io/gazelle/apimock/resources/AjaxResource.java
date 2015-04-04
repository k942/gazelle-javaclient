package io.gazelle.apimock.resources;

import io.gazelle.apimock.utils.AjaxResponse;
import io.gazelle.apimock.utils.Secured;

import java.io.IOException;
import java.util.Optional;

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

	@GET
	public Response getAjay(@Context UriInfo uriInfo) throws IOException {
		String requestAcion = uriInfo.getQueryParameters().getFirst("action");

		AjaxResponse ajaxResponse = new AjaxResponse("failure", "Process of request failed");
		Optional<AjaxAction> action = Optional.empty();
		try {
			action = Optional.of(AjaxAction.valueOf(requestAcion.toUpperCase()));
		} catch (IllegalArgumentException e) {
			return failure("No action for " + requestAcion);
		}

		if (action.isPresent()) {
			ajaxResponse = handleAction(action.get(), uriInfo);
		}

		return responseWith(ajaxResponse);
	}

	private Response failure(String message) {
		return responseWith(new AjaxResponse("failure", message));
	}

	private Response responseWith(AjaxResponse response) {
		return Response.ok().type(MediaType.APPLICATION_JSON).entity(response).build();
	}

	private AjaxResponse handleAction(AjaxAction action, UriInfo uriInfo) {
		return action.handle(uriInfo);
	}

}
