package io.gazelle.resources;

import io.gazelle.APIException;
import io.gazelle.RESTClient;
import io.gazelle.dto.Messages;

import javax.ws.rs.client.WebTarget;

import com.google.inject.Inject;

public class MessagesResource {

	private RESTClient client;
	private WebTarget target;

	@Inject
	public MessagesResource(RESTClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "inbox");
	}

	public Messages get() throws APIException {
		return get(new MessagesResourceArgs());
	}

	public Messages get(MessagesResourceArgs params) throws APIException {
		return client.get(params.apply(target), Messages.class);
	}
}
