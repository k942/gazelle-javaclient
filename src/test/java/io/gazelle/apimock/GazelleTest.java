package io.gazelle.apimock;

import io.gazelle.apimock.resources.AjaxResource;
import io.gazelle.apimock.utils.AuthorizationRequestFilter;
import io.gazelle.apimock.utils.DTOProvider;

import javax.ws.rs.core.Application;

import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.test.JerseyTest;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.jaxrs.json.JacksonJaxbJsonProvider;

public class GazelleTest extends JerseyTest {

	private static final String GAZELLE_API_PACKAGE = AjaxResource.class.getPackage().getName();
	private final String gazelleURL = getBaseUri().toString();
	protected DTOProvider dtoProvider = DTOProvider.INSTANCE;

	@Override
	protected Application configure() {
		ResourceConfig rc = new ResourceConfig();

		ObjectMapper om = new ObjectMapper();
		om.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);

		JacksonJaxbJsonProvider provider = new JacksonJaxbJsonProvider();
		provider.setMapper(om);
		rc.register(provider);
		rc.register(AuthorizationRequestFilter.class);

		return rc.packages(GAZELLE_API_PACKAGE);
	}

	protected String getGazelleURL() {
		return gazelleURL;
	}

}
