package io.gazelle.apimock;

import io.gazelle.GazelleClient;
import io.gazelle.apimock.resources.LoginResource;
import io.gazelle.dto.Index;

import java.net.MalformedURLException;

import org.junit.Assert;
import org.junit.Test;

public class IndexTest extends GazelleTest {

	@Test
	public void testIndex() throws MalformedURLException {
		GazelleClient client = GazelleClient.newInstance(getGazelleURL(), LoginResource.CORRECT_USERNAME,
				LoginResource.CORRECT_PASSWORD);
		Index index = client.getResources().index().get();
		Assert.assertEquals(dtoProvider.getInstance(Index.class), index);
	}

}
