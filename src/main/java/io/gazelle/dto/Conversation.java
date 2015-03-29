package io.gazelle.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
@JsonPropertyOrder({"convId", "subject", "sticky", "messages"})
public class Conversation {

	@JsonProperty("convId")
	private Long convId;
	@JsonProperty("subject")
	private String subject;
	@JsonProperty("sticky")
	private Boolean sticky;
	@JsonProperty("messages")
	private List<ConversationMessages> messages = new ArrayList<ConversationMessages>();
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
	 * @return The messages
	 */
	@JsonProperty("messages")
	public List<ConversationMessages> getMessages() {
		return messages;
	}

	/**
	 * 
	 * @param messages
	 *            The messages
	 */
	@JsonProperty("messages")
	public void setMessages(List<ConversationMessages> messages) {
		this.messages = messages;
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
