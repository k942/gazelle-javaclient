package io.gazelle.resources;

import io.gazelle.APIException;
import io.gazelle.RESTClient;
import io.gazelle.dto.Index;

import javax.ws.rs.client.WebTarget;

import com.google.inject.Inject;

public class IndexResource {

	private RESTClient client;
	private WebTarget target;

	@Inject
	public IndexResource(RESTClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "index");
	}

	public Index get() throws APIException {
		return client.get(target, Index.class);
	}
}
