package io.gazelle.resources;

import io.gazelle.GazelleClient;
import io.gazelle.dto.Index;

import javax.ws.rs.client.WebTarget;

public class IndexResource {

	private GazelleClient client;
	private WebTarget target;

	public IndexResource(GazelleClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "index");
	}

	public Index get() {
		return client.get(target, Index.class);
	}
}
