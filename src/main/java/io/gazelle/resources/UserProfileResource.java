package io.gazelle.resources;

import io.gazelle.GazelleClient;
import io.gazelle.dto.Userprofile;

import javax.ws.rs.client.WebTarget;

public class UserProfileResource {

	private GazelleClient client;
	private WebTarget target;

	public UserProfileResource(GazelleClient client, WebTarget parentTarget) {
		this.client = client;
		this.target = parentTarget.queryParam("action", "user");
	}

	public Userprofile get(Long id) {	
		return client.get(target.queryParam("id", id), Userprofile.class);
	}
}
