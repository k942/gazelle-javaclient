package io.gazelle.resources;

import io.gazelle.GazelleClient;
import io.gazelle.dto.Conversation;

import javax.ws.rs.client.WebTarget;

public class ConversationResource {

	private GazelleClient client;
	private WebTarget target;

	public ConversationResource(GazelleClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "inbox").queryParam("type", "viewconv");
	}

	public Conversation get(Long id) {
		return client.get(target.queryParam("id", id), Conversation.class);
	}
}
