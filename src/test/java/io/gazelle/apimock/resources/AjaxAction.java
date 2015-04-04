package io.gazelle.apimock.resources;

import io.gazelle.apimock.utils.AjaxResponse;
import io.gazelle.apimock.utils.DTOProvider;
import io.gazelle.dto.Conversation;
import io.gazelle.dto.Index;
import io.gazelle.dto.Messages;
import io.gazelle.dto.TopCategory;
import io.gazelle.dto.TopTagsResult;
import io.gazelle.dto.TopTorrentsResult;
import io.gazelle.dto.TopUsersResult;
import io.gazelle.dto.Userprofile;
import io.gazelle.resources.TopResource.TopType;

import java.util.Arrays;

import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.UriInfo;

public enum AjaxAction {
	INDEX() {
		@Override
		public AjaxResponse handle(UriInfo uriInfo) {
			return new AjaxResponse("success", dtoProvider.setInstance(Index.class));
		}
	},
	USER() {
		@Override
		public AjaxResponse handle(UriInfo uriInfo) {
			;
			return new AjaxResponse("success", dtoProvider.setInstance(Userprofile.class));
		}
	},
	INBOX() {
		@Override
		public AjaxResponse handle(UriInfo uriInfo) {
			String type = uriInfo.getQueryParameters().getFirst("type");
			Object response;
			if (type.equals("viewconv")) {
				response = dtoProvider.setInstance(Conversation.class);
			} else {
				response = dtoProvider.setInstance(Messages.class);
			}
			return new AjaxResponse("success", response);
		}
	},
	TOP10() {
		@Override
		public AjaxResponse handle(UriInfo uriInfo) {
			String type = uriInfo.getQueryParameters().getFirst("type");
			TopType topType = Arrays.asList(TopType.values()).stream().filter(t -> t.toString().equals(type))
					.findFirst().get();

			@SuppressWarnings("rawtypes")
			GenericType dtoType = null;
			switch (topType) {
				case TORRENTS :
					dtoType = new GenericType<TopCategory<TopTorrentsResult>>() {
					};
					break;
				case TAGS :
					dtoType = new GenericType<TopCategory<TopTagsResult>>() {
					};
					break;
				case USERS :
					dtoType = new GenericType<TopCategory<TopUsersResult>>() {
					};
					break;
				default :
					break;
			}
			Object response = dtoProvider.setInstanceList(dtoType.getType());
			return new AjaxResponse("success", response);
		}
	};

	public abstract AjaxResponse handle(UriInfo uriInfo);
	protected DTOProvider dtoProvider = DTOProvider.INSTANCE;

}
