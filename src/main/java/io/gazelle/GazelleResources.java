package io.gazelle;

import io.gazelle.resources.ConversationResource;
import io.gazelle.resources.IndexResource;
import io.gazelle.resources.MessagesResource;
import io.gazelle.resources.TopResource;
import io.gazelle.resources.UserProfileResource;

import com.google.inject.Inject;

public class GazelleResources {
	
	@Inject
	private IndexResource indexResource;
	@Inject
	private UserProfileResource userProfileResource;
	@Inject
	private MessagesResource messagesResource;
	@Inject
	private ConversationResource conversationResource;
	@Inject
	private TopResource topResource;

	public GazelleResources() {

	}

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
