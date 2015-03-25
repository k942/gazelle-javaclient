package io.gazelle.jerseytest;

import io.gazelle.jerseytest.ajaxapi.resources.AjaxResource;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

public class GazelleTest extends JerseyTest {
	
	private static final String GAZELLE_API_PACKAGE = AjaxResource.class.getPackage().getName();
	private final String gazelleURL = getBaseUri().toString();

	@Override
	protected Application configure() {
		return new ResourceConfig().packages(GAZELLE_API_PACKAGE);
	}
	
	protected String getGazelleURL() {
		return gazelleURL;
	}

}
