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
@JsonPropertyOrder({"messages", "notifications", "newAnnouncement", "newSubscriptions", "newBlog"})
public class Notifications {

	@JsonProperty("messages")
	private Long messages;
	@JsonProperty("notifications")
	private Long notifications;
	@JsonProperty("newAnnouncement")
	private Boolean newAnnouncement;
	@JsonProperty("newSubscriptions")
	private Boolean newSubscriptions;
	@JsonProperty("newBlog")
	private Boolean newBlog;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The messages
	 */
	@JsonProperty("messages")
	public Long getMessages() {
		return messages;
	}

	/**
	 * 
	 * @param messages
	 *            The messages
	 */
	@JsonProperty("messages")
	public void setMessages(Long messages) {
		this.messages = messages;
	}

	/**
	 * 
	 * @return The notifications
	 */
	@JsonProperty("notifications")
	public Long getNotifications() {
		return notifications;
	}

	/**
	 * 
	 * @param notifications
	 *            The notifications
	 */
	@JsonProperty("notifications")
	public void setNotifications(Long notifications) {
		this.notifications = notifications;
	}

	/**
	 * 
	 * @return The newAnnouncement
	 */
	@JsonProperty("newAnnouncement")
	public Boolean getNewAnnouncement() {
		return newAnnouncement;
	}

	/**
	 * 
	 * @param newAnnouncement
	 *            The newAnnouncement
	 */
	@JsonProperty("newAnnouncement")
	public void setNewAnnouncement(Boolean newAnnouncement) {
		this.newAnnouncement = newAnnouncement;
	}

	/**
	 * 
	 * @return The newSubscriptions
	 */
	@JsonProperty("newSubscriptions")
	public Boolean getNewSubscriptions() {
		return newSubscriptions;
	}

	/**
	 * 
	 * @param newSubscriptions
	 *            The newSubscriptions
	 */
	@JsonProperty("newSubscriptions")
	public void setNewSubscriptions(Boolean newSubscriptions) {
		this.newSubscriptions = newSubscriptions;
	}

	/**
	 * 
	 * @return The newBlog
	 */
	@JsonProperty("newBlog")
	public Boolean getNewBlog() {
		return newBlog;
	}

	/**
	 * 
	 * @param newBlog
	 *            The newBlog
	 */
	@JsonProperty("newBlog")
	public void setNewBlog(Boolean newBlog) {
		this.newBlog = newBlog;
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
