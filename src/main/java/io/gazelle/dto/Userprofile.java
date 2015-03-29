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
@JsonPropertyOrder({"username", "avatar", "isFriend", "profileText", "stats", "ranks", "personal", "community"})
public class Userprofile {

	@JsonProperty("username")
	private String username;
	@JsonProperty("avatar")
	private String avatar;
	@JsonProperty("isFriend")
	private Boolean isFriend;
	@JsonProperty("profileText")
	private String profileText;
	@JsonProperty("stats")
	private Stats stats;
	@JsonProperty("ranks")
	private Ranks ranks;
	@JsonProperty("personal")
	private Personal personal;
	@JsonProperty("community")
	private Community community;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The username
	 */
	@JsonProperty("username")
	public String getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 *            The username
	 */
	@JsonProperty("username")
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * 
	 * @return The avatar
	 */
	@JsonProperty("avatar")
	public String getAvatar() {
		return avatar;
	}

	/**
	 * 
	 * @param avatar
	 *            The avatar
	 */
	@JsonProperty("avatar")
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	/**
	 * 
	 * @return The isFriend
	 */
	@JsonProperty("isFriend")
	public Boolean getIsFriend() {
		return isFriend;
	}

	/**
	 * 
	 * @param isFriend
	 *            The isFriend
	 */
	@JsonProperty("isFriend")
	public void setIsFriend(Boolean isFriend) {
		this.isFriend = isFriend;
	}

	/**
	 * 
	 * @return The profileText
	 */
	@JsonProperty("profileText")
	public String getProfileText() {
		return profileText;
	}

	/**
	 * 
	 * @param profileText
	 *            The profileText
	 */
	@JsonProperty("profileText")
	public void setProfileText(String profileText) {
		this.profileText = profileText;
	}

	/**
	 * 
	 * @return The stats
	 */
	@JsonProperty("stats")
	public Stats getStats() {
		return stats;
	}

	/**
	 * 
	 * @param stats
	 *            The stats
	 */
	@JsonProperty("stats")
	public void setStats(Stats stats) {
		this.stats = stats;
	}

	/**
	 * 
	 * @return The ranks
	 */
	@JsonProperty("ranks")
	public Ranks getRanks() {
		return ranks;
	}

	/**
	 * 
	 * @param ranks
	 *            The ranks
	 */
	@JsonProperty("ranks")
	public void setRanks(Ranks ranks) {
		this.ranks = ranks;
	}

	/**
	 * 
	 * @return The personal
	 */
	@JsonProperty("personal")
	public Personal getPersonal() {
		return personal;
	}

	/**
	 * 
	 * @param personal
	 *            The personal
	 */
	@JsonProperty("personal")
	public void setPersonal(Personal personal) {
		this.personal = personal;
	}

	/**
	 * 
	 * @return The community
	 */
	@JsonProperty("community")
	public Community getCommunity() {
		return community;
	}

	/**
	 * 
	 * @param community
	 *            The community
	 */
	@JsonProperty("community")
	public void setCommunity(Community community) {
		this.community = community;
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
