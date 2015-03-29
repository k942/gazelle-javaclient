package io.gazelle.resources;

import io.gazelle.GazelleClient;

import javax.ws.rs.client.WebTarget;

public class GazelleResources {

	private GazelleClient client;
	private IndexResource indexResource;
	private UserProfileResource userProfileResource;
	private MessagesResource messagesResource;
	private ConversationResource conversationResource;
	private TopResource topResource;

	private GazelleResources(GazelleClient client, WebTarget baseTarget) {
		this.client = client;
		setupResources(baseTarget);
	}

	public static GazelleResources newInstance(GazelleClient client, WebTarget baseTarget) {
		return new GazelleResources(client, baseTarget);

	}

	private void setupResources(WebTarget baseTarget) {
		this.indexResource = new IndexResource(this.client, baseTarget);
		this.userProfileResource = new UserProfileResource(this.client, baseTarget);
		this.messagesResource = new MessagesResource(this.client, baseTarget);
		this.conversationResource = new ConversationResource(this.client, baseTarget);
		this.topResource = new TopResource(this.client, baseTarget);
	}

	/**
	 * @return the indexResource
	 */
	public IndexResource index() {
		return indexResource;
	}

	public UserProfileResource userProfile() {
		return userProfileResource;
	}

	public MessagesResource messages() {
		return messagesResource;
	}

	public TopResource top() {
		return topResource;
	}

	public ConversationResource conversations() {
		return conversationResource;
	}

}
