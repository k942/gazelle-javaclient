package io.gazelle;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
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
	
	/**
	 * Filtering request from Gazelle. </br>
	 * <ul>
	 * <li>Envelope JSON is unwrapped.</li>
	 * <li>If status is not 'success' the filter chain is broke</li>
	 * </ul>
	 * 
	 */
	@Override
	public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext)
			throws JsonProcessingException, IOException {
		
		InputStream entity = responseContext.getEntityStream();
		JsonNode node;
		

		node = objectMapper.readTree(entity);
		entity.close();
		

		if (!node.get("status").asText().equals("success")) {
			InputStream is = IOUtils.toInputStream(node.toString(), StandardCharsets.UTF_8);
			responseContext.setEntityStream(is);
			responseContext.setStatusInfo(Status.INTERNAL_SERVER_ERROR);
			return;
		}

		String response = "";
		if (node.get("response") != null) {
			response = node.get("response").toString();
		}

		InputStream ids = IOUtils.toInputStream(response, StandardCharsets.UTF_8);
		responseContext.setEntityStream(ids);

		String contentType = responseContext.getHeaders().getFirst("Content-Type");
		if (contentType.startsWith("text/plain")) {
			String newContentType = "application/json" + contentType.substring(10);
			responseContext.getHeaders().putSingle("Content-Type", newContentType);
		}

	}
}