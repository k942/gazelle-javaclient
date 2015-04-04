package io.gazelle.apimock;

import io.gazelle.APIException;
import io.gazelle.GazelleClient;
import io.gazelle.apimock.resources.LoginResource;
import io.gazelle.dto.Conversation;
import io.gazelle.dto.Index;
import io.gazelle.dto.Messages;
import io.gazelle.dto.TopCategory;
import io.gazelle.dto.TopTagsResult;
import io.gazelle.dto.TopTorrentsResult;
import io.gazelle.dto.TopUsersResult;
import io.gazelle.dto.Userprofile;

import java.util.List;

import javax.ws.rs.core.GenericType;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class DTOTest extends GazelleTest {

	GazelleClient client;

	@BeforeClass
	public void setupClient() {
		client = GazelleClient.newInstance(getGazelleURL(), LoginResource.CORRECT_USERNAME,
				LoginResource.CORRECT_PASSWORD);
	}

	@Test
	public void testIndex() throws APIException {
		Index dto = client.getResources().index().get();
		Assert.assertEquals(dtoProvider.getInstance(Index.class), dto);
	}

	@Test
	public void testUserProfile() throws APIException {
		Userprofile dto = client.getResources().userProfile().get(Long.valueOf(3423));
		Assert.assertEquals(dtoProvider.getInstance(Userprofile.class), dto);
	}

	@Test
	public void testMessages() throws APIException {
		Messages dto = client.getResources().messages().get();
		Assert.assertEquals(dtoProvider.getInstance(Messages.class), dto);
	}

	@Test
	public void testConversation() throws APIException {
		Conversation dto = client.getResources().conversations().get(Long.valueOf(342));
		Assert.assertEquals(dtoProvider.getInstance(Conversation.class), dto);
	}

	@Test
	public void testTopTorrent() throws APIException {
		List<TopCategory<TopTorrentsResult>> top10 = client.getResources().top().getTorrents(10);
		Assert.assertEquals(dtoProvider.getInstanceList(new GenericType<TopCategory<TopTorrentsResult>>() {
		}.getType()), top10);
	}

	@Test
	public void testTopTags() throws APIException {
		List<TopCategory<TopTagsResult>> top10 = client.getResources().top().getTags(10);
		Assert.assertEquals(dtoProvider.getInstanceList(new GenericType<TopCategory<TopTagsResult>>() {
		}.getType()), top10);
	}

	@Test
	public void testTopUsers() throws APIException {
		List<TopCategory<TopUsersResult>> top10 = client.getResources().top().getUsers(10);
		Assert.assertEquals(dtoProvider.getInstanceList(new GenericType<TopCategory<TopUsersResult>>() {
		}.getType()), top10);
	}

}
