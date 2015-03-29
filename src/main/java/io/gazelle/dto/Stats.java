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
@JsonPropertyOrder({"joinedDate", "lastAccess", "uploaded", "downloaded", "ratio", "requiredRatio"})
public class Stats {

	@JsonProperty("joinedDate")
	private String joinedDate;
	@JsonProperty("lastAccess")
	private String lastAccess;
	@JsonProperty("uploaded")
	private Long uploaded;
	@JsonProperty("downloaded")
	private Long downloaded;
	@JsonProperty("ratio")
	private Double ratio;
	@JsonProperty("requiredRatio")
	private Double requiredRatio;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The joinedDate
	 */
	@JsonProperty("joinedDate")
	public String getJoinedDate() {
		return joinedDate;
	}

	/**
	 * 
	 * @param joinedDate
	 *            The joinedDate
	 */
	@JsonProperty("joinedDate")
	public void setJoinedDate(String joinedDate) {
		this.joinedDate = joinedDate;
	}

	/**
	 * 
	 * @return The lastAccess
	 */
	@JsonProperty("lastAccess")
	public String getLastAccess() {
		return lastAccess;
	}

	/**
	 * 
	 * @param lastAccess
	 *            The lastAccess
	 */
	@JsonProperty("lastAccess")
	public void setLastAccess(String lastAccess) {
		this.lastAccess = lastAccess;
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
	 * @return The ratio
	 */
	@JsonProperty("ratio")
	public Double getRatio() {
		return ratio;
	}

	/**
	 * 
	 * @param ratio
	 *            The ratio
	 */
	@JsonProperty("ratio")
	public void setRatio(Double ratio) {
		this.ratio = ratio;
	}

	/**
	 * 
	 * @return The requiredRatio
	 */
	@JsonProperty("requiredRatio")
	public Double getRequiredRatio() {
		return requiredRatio;
	}

	/**
	 * 
	 * @param requiredRatio
	 *            The requiredRatio
	 */
	@JsonProperty("requiredRatio")
	public void setRequiredRatio(Double requiredRatio) {
		this.requiredRatio = requiredRatio;
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
