package io.gazelle;

import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;

import javax.ws.rs.client.ClientRequestContext;
import javax.ws.rs.client.ClientResponseContext;
import javax.ws.rs.client.ClientResponseFilter;
import javax.ws.rs.ext.Provider;

import org.apache.commons.io.IOUtils;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

@Provider
public class GazelleResponseFilter implements ClientResponseFilter {
	
	private ObjectMapper objectMapper;
	
	public GazelleResponseFilter(ObjectMapper objectMapper) {
		this.objectMapper = objectMapper;
	}
	@Override
	public void filter(ClientRequestContext requestContext, ClientResponseContext responseContext) {
		InputStream entity = responseContext.getEntityStream();
		JsonNode node;
		try {
			node = objectMapper.readTree(entity);
			if (!node.get("status").asText().equals("success")) {
				throw new RuntimeException("Failure");
			}
			String ads = node.get("response").toString();
			InputStream is = IOUtils.toInputStream(ads, StandardCharsets.UTF_8);
			responseContext.setEntityStream(is);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}

	}
}