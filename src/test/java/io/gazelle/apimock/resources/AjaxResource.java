package io.gazelle.apimock.resources;

import io.gazelle.apimock.utils.AjaxAction;
import io.gazelle.apimock.utils.AjaxResponse;
import io.gazelle.apimock.utils.DTOProvider;
import io.gazelle.apimock.utils.Secured;
import io.gazelle.resources.TopResource.TopType;

import java.io.IOException;
import java.util.Arrays;

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
		String requestAcion = info.getQueryParameters().getFirst("action");

		AjaxResponse ajaxResponse = new AjaxResponse();
		ajaxResponse.setStatus("failure");

		AjaxAction action = null;
		try {
			action = AjaxAction.valueOf(requestAcion.toUpperCase());
			
			if (action == AjaxAction.INBOX) {
				String type = info.getQueryParameters().getFirst("type");
				if (type.equals("viewconv")) {
					action = AjaxAction.INBOX_VIEWCONV;
				}
			}
			
			if (action == AjaxAction.TOP10) {
				String type = info.getQueryParameters().getFirst("type");
				TopType topType = Arrays.asList(TopType.values()).stream().filter(t -> t.toString().equals(type)).findFirst().get();
				
				switch (topType) {
					case TORRENTS: action = AjaxAction.TOP10_TORRENTS; break;
					case TAGS: action = AjaxAction.TOP10_TAGS; break;
					case USERS: action = AjaxAction.TOP10_USERS; break;
					default :
						break;
				}
				
			}
		} catch (IllegalArgumentException e) {
			ajaxResponse.setResponse("No action for " + requestAcion);
		}

		if (action != null) {
			ajaxResponse.setStatus("success");
			ajaxResponse.setResponse(dtoProvider.setInstance(action.getDto()));
		}

		return Response.ok().type(MediaType.APPLICATION_JSON).entity(ajaxResponse).build();
	}
	
}
