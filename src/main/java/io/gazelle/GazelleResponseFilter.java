package io.gazelle;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.Provider;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
public class GazelleResponseFilter implements ClientResponseFilter {

	private ObjectMapper objectMapper;

	public GazelleResponseFilter(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	@Override
	public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext)
			throws JsonProcessingException, IOException {
		InputStream entity = responseContext.getEntityStream();
		JsonNode node;

		node = objectMapper.readTree(entity);
		if (!node.get("status").asText().equals("success")) {
			requestContext.abortWith(Response.status(Status.INTERNAL_SERVER_ERROR).entity(node).build());
		}
		
		// and response is not an array { ..., reponse : [ ... ] }
		String response = node.toString();
		if (!node.get("response").isArray()) {
			response = node.get("response").toString();
		}
		InputStream is = IOUtils.toInputStream(response, StandardCharsets.UTF_8);
		responseContext.setEntityStream(is);

		String contentType = responseContext.getHeaders().getFirst("Content-Type");
		if (contentType.startsWith("text/plain")) {
			String newContentType = "application/json" + contentType.substring(10);
			responseContext.getHeaders().putSingle("Content-Type", newContentType);
		}

	}
}