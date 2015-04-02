package io.gazelle.resources;

import io.gazelle.RESTClient;
import io.gazelle.dto.Userprofile;

import javax.ws.rs.client.WebTarget;

import com.google.inject.Inject;

public class UserProfileResource {

	private RESTClient client;
	private WebTarget target;

	@Inject
	public UserProfileResource(RESTClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "user");
	}

	public Userprofile get(Long id) {
		return client.get(target.queryParam("id", id), Userprofile.class);
	}
}
