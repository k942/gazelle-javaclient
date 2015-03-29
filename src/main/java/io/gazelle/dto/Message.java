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
@JsonPropertyOrder({"convId", "subject", "unread", "sticky", "forwardedId", "forwardedName", "senderId", "username",
		"donor", "warned", "enabled", "date"})
public class Message {

	@JsonProperty("convId")
	private Long convId;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("unread")
	private Boolean unread;
	@JsonProperty("sticky")
	private Boolean sticky;
	@JsonProperty("forwardedId")
	private Long forwardedId;
	@JsonProperty("forwardedName")
	private String forwardedName;
	@JsonProperty("senderId")
	private Long senderId;
	@JsonProperty("username")
	private String username;
	@JsonProperty("donor")
	private Boolean donor;
	@JsonProperty("warned")
	private Boolean warned;
	@JsonProperty("enabled")
	private Boolean enabled;
	@JsonProperty("date")
	private String date;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The convId
	 */
	@JsonProperty("convId")
	public Long getConvId() {
		return convId;
	}

	/**
	 * 
	 * @param convId
	 *            The convId
	 */
	@JsonProperty("convId")
	public void setConvId(Long convId) {
		this.convId = convId;
	}

	/**
	 * 
	 * @return The subject
	 */
	@JsonProperty("subject")
	public String getSubject() {
		return subject;
	}

	/**
	 * 
	 * @param subject
	 *            The subject
	 */
	@JsonProperty("subject")
	public void setSubject(String subject) {
		this.subject = subject;
	}

	/**
	 * 
	 * @return The unread
	 */
	@JsonProperty("unread")
	public Boolean getUnread() {
		return unread;
	}

	/**
	 * 
	 * @param unread
	 *            The unread
	 */
	@JsonProperty("unread")
	public void setUnread(Boolean unread) {
		this.unread = unread;
	}

	/**
	 * 
	 * @return The sticky
	 */
	@JsonProperty("sticky")
	public Boolean getSticky() {
		return sticky;
	}

	/**
	 * 
	 * @param sticky
	 *            The sticky
	 */
	@JsonProperty("sticky")
	public void setSticky(Boolean sticky) {
		this.sticky = sticky;
	}

	/**
	 * 
	 * @return The forwardedId
	 */
	@JsonProperty("forwardedId")
	public Long getForwardedId() {
		return forwardedId;
	}

	/**
	 * 
	 * @param forwardedId
	 *            The forwardedId
	 */
	@JsonProperty("forwardedId")
	public void setForwardedId(Long forwardedId) {
		this.forwardedId = forwardedId;
	}

	/**
	 * 
	 * @return The forwardedName
	 */
	@JsonProperty("forwardedName")
	public String getForwardedName() {
		return forwardedName;
	}

	/**
	 * 
	 * @param forwardedName
	 *            The forwardedName
	 */
	@JsonProperty("forwardedName")
	public void setForwardedName(String forwardedName) {
		this.forwardedName = forwardedName;
	}

	/**
	 * 
	 * @return The senderId
	 */
	@JsonProperty("senderId")
	public Long getSenderId() {
		return senderId;
	}

	/**
	 * 
	 * @param senderId
	 *            The senderId
	 */
	@JsonProperty("senderId")
	public void setSenderId(Long senderId) {
		this.senderId = senderId;
	}

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
	 * @return The donor
	 */
	@JsonProperty("donor")
	public Boolean getDonor() {
		return donor;
	}

	/**
	 * 
	 * @param donor
	 *            The donor
	 */
	@JsonProperty("donor")
	public void setDonor(Boolean donor) {
		this.donor = donor;
	}

	/**
	 * 
	 * @return The warned
	 */
	@JsonProperty("warned")
	public Boolean getWarned() {
		return warned;
	}

	/**
	 * 
	 * @param warned
	 *            The warned
	 */
	@JsonProperty("warned")
	public void setWarned(Boolean warned) {
		this.warned = warned;
	}

	/**
	 * 
	 * @return The enabled
	 */
	@JsonProperty("enabled")
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * 
	 * @param enabled
	 *            The enabled
	 */
	@JsonProperty("enabled")
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * 
	 * @return The date
	 */
	@JsonProperty("date")
	public String getDate() {
		return date;
	}

	/**
	 * 
	 * @param date
	 *            The date
	 */
	@JsonProperty("date")
	public void setDate(String date) {
		this.date = date;
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
