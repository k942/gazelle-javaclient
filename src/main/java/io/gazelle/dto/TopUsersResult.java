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
@JsonPropertyOrder({"id", "username", "uploaded", "upSpeed", "downloaded", "downSpeed", "numUploads", "joinDate"})
public class TopUsersResult {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("username")
	private Object username;
	@JsonProperty("uploaded")
	private Long uploaded;
	@JsonProperty("upSpeed")
	private Double upSpeed;
	@JsonProperty("downloaded")
	private Long downloaded;
	@JsonProperty("downSpeed")
	private Double downSpeed;
	@JsonProperty("numUploads")
	private Long numUploads;
	@JsonProperty("joinDate")
	private String joinDate;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The username
	 */
	@JsonProperty("username")
	public Object getUsername() {
		return username;
	}

	/**
	 * 
	 * @param username
	 *            The username
	 */
	@JsonProperty("username")
	public void setUsername(Object username) {
		this.username = username;
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
	 * @return The upSpeed
	 */
	@JsonProperty("upSpeed")
	public Double getUpSpeed() {
		return upSpeed;
	}

	/**
	 * 
	 * @param upSpeed
	 *            The upSpeed
	 */
	@JsonProperty("upSpeed")
	public void setUpSpeed(Double upSpeed) {
		this.upSpeed = upSpeed;
	}

	/**
	 * 
	 * @return The downloaded
	 */
	@JsonProperty("downloaded")
	public Long getDownloaded() {
		return downloaded;
	}

	/**
	 * 
	 * @param downloaded
	 *            The downloaded
	 */
	@JsonProperty("downloaded")
	public void setDownloaded(Long downloaded) {
		this.downloaded = downloaded;
	}

	/**
	 * 
	 * @return The downSpeed
	 */
	@JsonProperty("downSpeed")
	public Double getDownSpeed() {
		return downSpeed;
	}

	/**
	 * 
	 * @param downSpeed
	 *            The downSpeed
	 */
	@JsonProperty("downSpeed")
	public void setDownSpeed(Double downSpeed) {
		this.downSpeed = downSpeed;
	}

	/**
	 * 
	 * @return The numUploads
	 */
	@JsonProperty("numUploads")
	public Long getNumUploads() {
		return numUploads;
	}

	/**
	 * 
	 * @param numUploads
	 *            The numUploads
	 */
	@JsonProperty("numUploads")
	public void setNumUploads(Long numUploads) {
		this.numUploads = numUploads;
	}

	/**
	 * 
	 * @return The joinDate
	 */
	@JsonProperty("joinDate")
	public String getJoinDate() {
		return joinDate;
	}

	/**
	 * 
	 * @param joinDate
	 *            The joinDate
	 */
	@JsonProperty("joinDate")
	public void setJoinDate(String joinDate) {
		this.joinDate = joinDate;
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
