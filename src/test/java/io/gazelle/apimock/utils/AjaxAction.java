package io.gazelle.apimock.utils;

import io.gazelle.dto.Conversation;
import io.gazelle.dto.Index;
import io.gazelle.dto.Messages;
import io.gazelle.dto.TopTags;
import io.gazelle.dto.TopTorrents;
import io.gazelle.dto.TopUsers;
import io.gazelle.dto.Userprofile;

public enum AjaxAction {
	INDEX(Index.class), USER(Userprofile.class), INBOX(Messages.class), INBOX_VIEWCONV(Conversation.class), TOP10(
			Object.class), TOP10_TORRENTS(TopTorrents.class), TOP10_TAGS(TopTags.class), TOP10_USERS(TopUsers.class);

	private Class<?> dto;

	AjaxAction(Class<?> dto) {
		this.dto = dto;
	}

	public Class<?> getDto() {
		return dto;
	}

}
