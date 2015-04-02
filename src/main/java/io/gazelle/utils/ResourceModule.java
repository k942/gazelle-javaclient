package io.gazelle.utils;

import io.gazelle.RESTClient;

import javax.ws.rs.client.WebTarget;

import com.google.inject.AbstractModule;
import com.google.inject.Inject;
import com.google.inject.Provides;

public class ResourceModule extends AbstractModule {

	private RESTClient client;
	private WebTarget target;

	@Inject
	public ResourceModule(RESTClient client, WebTarget target) {
		this.client = client;
		this.target = target;
	}

	@Provides
	RESTClient getClient() {
		return client;
	}

	@Provides
	WebTarget getTarget() {
		return target;
	}

	@Override
	protected void configure() {

	}

}
