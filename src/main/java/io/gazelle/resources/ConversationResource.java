package io.gazelle.resources;

import io.gazelle.RESTClient;
import io.gazelle.dto.Conversation;

import javax.ws.rs.client.WebTarget;

import com.google.inject.Inject;

public class ConversationResource {

	private RESTClient client;
	private WebTarget target;

	@Inject
	public ConversationResource(RESTClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "inbox").queryParam("type", "viewconv");
	}

	public Conversation get(Long id) {
		return client.get(target.queryParam("id", id), Conversation.class);
	}
}
