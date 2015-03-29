package io.gazelle.dto;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;
import uk.co.jemos.podam.common.PodamCollection;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@AutoProperty
@JsonPropertyOrder({"posts", "torrentComments", "collagesStarted", "collagesContrib", "requestsFilled",
		"requestsVoted", "perfectFlacs", "uploaded", "groups", "seeding", "leeching", "snatched", "invited"})
public class Community {

	@JsonProperty("posts")
	private Long posts;
	@JsonProperty("torrentComments")
	private Long torrentComments;
	@JsonProperty("collagesStarted")
	private Long collagesStarted;
	@JsonProperty("collagesContrib")
	private Long collagesContrib;
	@JsonProperty("requestsFilled")
	private Long requestsFilled;
	@JsonProperty("requestsVoted")
	private Long requestsVoted;
	@JsonProperty("perfectFlacs")
	private Long perfectFlacs;
	@JsonProperty("uploaded")
	private Long uploaded;
	@JsonProperty("groups")
	private Long groups;
	@JsonProperty("seeding")
	private Long seeding;
	@JsonProperty("leeching")
	private Long leeching;
	@JsonProperty("snatched")
	private Long snatched;
	@JsonProperty("invited")
	private Long invited;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The posts
	 */
	@JsonProperty("posts")
	public Long getPosts() {
		return posts;
	}

	/**
	 * 
	 * @param posts
	 *            The posts
	 */
	@JsonProperty("posts")
	public void setPosts(Long posts) {
		this.posts = posts;
	}

	/**
	 * 
	 * @return The torrentComments
	 */
	@JsonProperty("torrentComments")
	public Long getTorrentComments() {
		return torrentComments;
	}

	/**
	 * 
	 * @param torrentComments
	 *            The torrentComments
	 */
	@JsonProperty("torrentComments")
	public void setTorrentComments(Long torrentComments) {
		this.torrentComments = torrentComments;
	}

	/**
	 * 
	 * @return The collagesStarted
	 */
	@JsonProperty("collagesStarted")
	public Long getCollagesStarted() {
		return collagesStarted;
	}

	/**
	 * 
	 * @param collagesStarted
	 *            The collagesStarted
	 */
	@JsonProperty("collagesStarted")
	public void setCollagesStarted(Long collagesStarted) {
		this.collagesStarted = collagesStarted;
	}

	/**
	 * 
	 * @return The collagesContrib
	 */
	@JsonProperty("collagesContrib")
	public Long getCollagesContrib() {
		return collagesContrib;
	}

	/**
	 * 
	 * @param collagesContrib
	 *            The collagesContrib
	 */
	@JsonProperty("collagesContrib")
	public void setCollagesContrib(Long collagesContrib) {
		this.collagesContrib = collagesContrib;
	}

	/**
	 * 
	 * @return The requestsFilled
	 */
	@JsonProperty("requestsFilled")
	public Long getRequestsFilled() {
		return requestsFilled;
	}

	/**
	 * 
	 * @param requestsFilled
	 *            The requestsFilled
	 */
	@JsonProperty("requestsFilled")
	public void setRequestsFilled(Long requestsFilled) {
		this.requestsFilled = requestsFilled;
	}

	/**
	 * 
	 * @return The requestsVoted
	 */
	@JsonProperty("requestsVoted")
	public Long getRequestsVoted() {
		return requestsVoted;
	}

	/**
	 * 
	 * @param requestsVoted
	 *            The requestsVoted
	 */
	@JsonProperty("requestsVoted")
	public void setRequestsVoted(Long requestsVoted) {
		this.requestsVoted = requestsVoted;
	}

	/**
	 * 
	 * @return The perfectFlacs
	 */
	@JsonProperty("perfectFlacs")
	public Long getPerfectFlacs() {
		return perfectFlacs;
	}

	/**
	 * 
	 * @param perfectFlacs
	 *            The perfectFlacs
	 */
	@JsonProperty("perfectFlacs")
	public void setPerfectFlacs(Long perfectFlacs) {
		this.perfectFlacs = perfectFlacs;
	}

	/**
	 * 
	 * @return The uploaded
	 */
	@JsonProperty("uploaded")
	public Long getUploaded() {
		return uploaded;
	}

	/**
	 * 
	 * @param uploaded
	 *            The uploaded
	 */
	@JsonProperty("uploaded")
	public void setUploaded(Long uploaded) {
		this.uploaded = uploaded;
	}

	/**
	 * 
	 * @return The groups
	 */
	@JsonProperty("groups")
	public Long getGroups() {
		return groups;
	}

	/**
	 * 
	 * @param groups
	 *            The groups
	 */
	@JsonProperty("groups")
	public void setGroups(Long groups) {
		this.groups = groups;
	}

	/**
	 * 
	 * @return The seeding
	 */
	@JsonProperty("seeding")
	public Long getSeeding() {
		return seeding;
	}

	/**
	 * 
	 * @param seeding
	 *            The seeding
	 */
	@JsonProperty("seeding")
	public void setSeeding(Long seeding) {
		this.seeding = seeding;
	}

	/**
	 * 
	 * @return The leeching
	 */
	@JsonProperty("leeching")
	public Long getLeeching() {
		return leeching;
	}

	/**
	 * 
	 * @param leeching
	 *            The leeching
	 */
	@JsonProperty("leeching")
	public void setLeeching(Long leeching) {
		this.leeching = leeching;
	}

	/**
	 * 
	 * @return The snatched
	 */
	@JsonProperty("snatched")
	public Long getSnatched() {
		return snatched;
	}

	/**
	 * 
	 * @param snatched
	 *            The snatched
	 */
	@JsonProperty("snatched")
	public void setSnatched(Long snatched) {
		this.snatched = snatched;
	}

	/**
	 * 
	 * @return The invited
	 */
	@JsonProperty("invited")
	public Long getInvited() {
		return invited;
	}

	/**
	 * 
	 * @param invited
	 *            The invited
	 */
	@JsonProperty("invited")
	public void setInvited(Long invited) {
		this.invited = invited;
	}

	@JsonAnyGetter
	public Map<String, Object> getAdditionalProperties() {
		return this.additionalProperties;
	}

	@JsonAnySetter
	public void setAdditionalProperty(String name, Object value) {
		this.additionalProperties.put(name, value);
	}

	public void setAdditionalProperties(Map<String, Object> additionalProperties) {
		this.additionalProperties = additionalProperties;
	}

	@Override
	public String toString() {
		return Pojomatic.toString(this);
	}

	@Override
	public int hashCode() {
		return Pojomatic.hashCode(this);
	}

	@Override
	public boolean equals(Object o) {
		return Pojomatic.equals(this, o);
	}

}
