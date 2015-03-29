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
@JsonPropertyOrder({"username", "id", "authkey", "passkey", "notifications", "userstats"})
public class Index {

	@JsonProperty("username")
	private String username;
	@JsonProperty("id")
	private Long id;
	@JsonProperty("authkey")
	private String authkey;
	@JsonProperty("passkey")
	private String passkey;
	@JsonProperty("notifications")
	private Notifications notifications;
	@JsonProperty("userstats")
	private Userstats userstats;
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
	 * @return The id
	 */
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The authkey
	 */
	@JsonProperty("authkey")
	public String getAuthkey() {
		return authkey;
	}

	/**
	 * 
	 * @param authkey
	 *            The authkey
	 */
	@JsonProperty("authkey")
	public void setAuthkey(String authkey) {
		this.authkey = authkey;
	}

	/**
	 * 
	 * @return The passkey
	 */
	@JsonProperty("passkey")
	public String getPasskey() {
		return passkey;
	}

	/**
	 * 
	 * @param passkey
	 *            The passkey
	 */
	@JsonProperty("passkey")
	public void setPasskey(String passkey) {
		this.passkey = passkey;
	}

	/**
	 * 
	 * @return The notifications
	 */
	@JsonProperty("notifications")
	public Notifications getNotifications() {
		return notifications;
	}

	/**
	 * 
	 * @param notifications
	 *            The notifications
	 */
	@JsonProperty("notifications")
	public void setNotifications(Notifications notifications) {
		this.notifications = notifications;
	}

	/**
	 * 
	 * @return The userstats
	 */
	@JsonProperty("userstats")
	public Userstats getUserstats() {
		return userstats;
	}

	/**
	 * 
	 * @param userstats
	 *            The userstats
	 */
	@JsonProperty("userstats")
	public void setUserstats(Userstats userstats) {
		this.userstats = userstats;
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
