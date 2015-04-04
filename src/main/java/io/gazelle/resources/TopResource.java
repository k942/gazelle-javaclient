package io.gazelle.resources;

import io.gazelle.APIException;
import io.gazelle.RESTClient;
import io.gazelle.dto.TopCategory;
import io.gazelle.dto.TopTagsResult;
import io.gazelle.dto.TopTorrentsResult;
import io.gazelle.dto.TopUsersResult;

import java.util.List;

import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;

import com.google.inject.Inject;

public class TopResource {

	private RESTClient client;
	private WebTarget target;

	public enum TopType {
		TORRENTS("torrents"), TAGS("tags"), USERS("users");

		private String value;

		TopType(String value) {
			this.value = value;
		}

		public String toString() {
			return value;
		}
	}

	@Inject
	public TopResource(RESTClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "top10");
	}

	public List<TopCategory<TopTorrentsResult>> getTorrents(int limit) throws APIException {
		return client.get(target.queryParam("type", TopType.TORRENTS).queryParam("limit", limit),
				new GenericType<List<TopCategory<TopTorrentsResult>>>() {
				});
	}

	public List<TopCategory<TopTagsResult>> getTags(int limit) throws APIException {
		return client.get(target.queryParam("type", TopType.TAGS).queryParam("limit", limit),
				new GenericType<List<TopCategory<TopTagsResult>>>() {
				});
	}

	public List<TopCategory<TopUsersResult>> getUsers(int limit) throws APIException {
		return client.get(target.queryParam("type", TopType.USERS).queryParam("limit", limit),
				new GenericType<List<TopCategory<TopUsersResult>>>() {
				});
	}
}
