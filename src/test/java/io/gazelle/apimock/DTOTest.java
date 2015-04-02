package io.gazelle.apimock;

import io.gazelle.GazelleClient;
import io.gazelle.apimock.resources.LoginResource;
import io.gazelle.dto.Conversation;
import io.gazelle.dto.Index;
import io.gazelle.dto.Messages;
import io.gazelle.dto.TopCategory;
import io.gazelle.dto.TopTags;
import io.gazelle.dto.TopTagsResult;
import io.gazelle.dto.TopTorrents;
import io.gazelle.dto.TopTorrentsResult;
import io.gazelle.dto.TopUsers;
import io.gazelle.dto.TopUsersResult;
import io.gazelle.dto.Userprofile;

import java.net.MalformedURLException;
import java.util.List;

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
	public void testIndex() throws MalformedURLException {
		Index dto = client.getResources().index().get();
		Assert.assertEquals(dtoProvider.getInstance(Index.class), dto);
	}

	@Test
	public void testUserProfile() throws MalformedURLException {
		Userprofile dto = client.getResources().userProfile().get(Long.valueOf(3423));
		Assert.assertEquals(dtoProvider.getInstance(Userprofile.class), dto);
	}

	@Test
	public void testMessages() throws MalformedURLException {
		Messages dto = client.getResources().messages().get();
		Assert.assertEquals(dtoProvider.getInstance(Messages.class), dto);
	}

	@Test
	public void testConversation() throws MalformedURLException {
		Conversation dto = client.getResources().conversations().get(Long.valueOf(342));
		Assert.assertEquals(dtoProvider.getInstance(Conversation.class), dto);
	}

	@Test
	public void testTopTen() throws MalformedURLException {
		List<TopCategory<TopTorrentsResult>> top10torrent = client.getResources().top().getTorrents(10);
		Assert.assertEquals(dtoProvider.getInstance(TopTorrents.class).getResponse(), top10torrent);

		List<TopCategory<TopTagsResult>> top10tags = client.getResources().top().getTags(10);
		Assert.assertEquals(dtoProvider.getInstance(TopTags.class).getResponse(), top10tags);

		List<TopCategory<TopUsersResult>> top10users = client.getResources().top().getUsers(10);
		Assert.assertEquals(dtoProvider.getInstance(TopUsers.class).getResponse(), top10users);
	}

}
