package io.gazelle.resources;

import io.gazelle.GazelleClient;
import io.gazelle.dto.Messages;

import javax.ws.rs.client.WebTarget;

public class MessagesResource {

	private GazelleClient client;
	private WebTarget target;

	public MessagesResource(GazelleClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "inbox");
	}

	public Messages get() {
		return get(new MessagesResourceArgs());
	}

	public Messages get(MessagesResourceArgs params) {
		return client.get(params.apply(target), Messages.class);
	}
}
