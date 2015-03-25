package io.gazelle.jerseytest;

import io.gazelle.GazelleClient;
import io.gazelle.jerseytest.ajaxapi.resources.LoginResource;
import io.gazelle.resources.index.Index;

import org.junit.Assert;
import org.junit.Test;

public class IndexTest extends GazelleTest {

	@Test
	public void testIndex() {
		GazelleClient client = GazelleClient.newInstance(getGazelleURL(), LoginResource.CORRECT_USERNAME,
				LoginResource.CORRECT_PASSWORD);
		Index index = client.request("index", Index.class);
		Assert.assertEquals("dr4g0n", index.getUsername());
		Assert.assertEquals(469, index.getId());
	}

}
