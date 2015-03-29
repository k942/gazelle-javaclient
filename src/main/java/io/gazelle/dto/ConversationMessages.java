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
@JsonPropertyOrder({"messageId", "senderId", "senderName", "sentDate", "bbBody", "body"})
public class ConversationMessages {

	@JsonProperty("messageId")
	private Long messageId;
	@JsonProperty("senderId")
	private Long senderId;
	@JsonProperty("senderName")
	private String senderName;
	@JsonProperty("sentDate")
	private String sentDate;
	@JsonProperty("bbBody")
	private String bbBody;
	@JsonProperty("body")
	private String body;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The messageId
	 */
	@JsonProperty("messageId")
	public Long getMessageId() {
		return messageId;
	}

	/**
	 * 
	 * @param messageId
	 *            The messageId
	 */
	@JsonProperty("messageId")
	public void setMessageId(Long messageId) {
		this.messageId = messageId;
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
	 * @return The senderName
	 */
	@JsonProperty("senderName")
	public String getSenderName() {
		return senderName;
	}

	/**
	 * 
	 * @param senderName
	 *            The senderName
	 */
	@JsonProperty("senderName")
	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	/**
	 * 
	 * @return The sentDate
	 */
	@JsonProperty("sentDate")
	public String getSentDate() {
		return sentDate;
	}

	/**
	 * 
	 * @param sentDate
	 *            The sentDate
	 */
	@JsonProperty("sentDate")
	public void setSentDate(String sentDate) {
		this.sentDate = sentDate;
	}

	/**
	 * 
	 * @return The bbBody
	 */
	@JsonProperty("bbBody")
	public String getBbBody() {
		return bbBody;
	}

	/**
	 * 
	 * @param bbBody
	 *            The bbBody
	 */
	@JsonProperty("bbBody")
	public void setBbBody(String bbBody) {
		this.bbBody = bbBody;
	}

	/**
	 * 
	 * @return The body
	 */
	@JsonProperty("body")
	public String getBody() {
		return body;
	}

	/**
	 * 
	 * @param body
	 *            The body
	 */
	@JsonProperty("body")
	public void setBody(String body) {
		this.body = body;
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
