package io.gazelle.resources;

import io.gazelle.GazelleClient;

import javax.ws.rs.client.WebTarget;

public class GazelleResources {

	private GazelleClient client;
	private IndexResource indexResource;

	private GazelleResources(GazelleClient client, WebTarget baseTarget) {
		this.client = client;
		setupResources(baseTarget);
	}

	public static GazelleResources newInstance(GazelleClient client, WebTarget baseTarget) {
		return new GazelleResources(client, baseTarget);

	}

	private void setupResources(WebTarget baseTarget) {
		this.indexResource = new IndexResource(this.client, baseTarget);
	}

	/**
	 * @return the indexResource
	 */
	public IndexResource getIndexResource() {
		return indexResource;
	}

}
