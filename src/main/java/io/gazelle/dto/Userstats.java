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
@JsonPropertyOrder({"uploaded", "downloaded", "ratio", "requiredratio", "class"})
public class Userstats {

	@JsonProperty("uploaded")
	private Long uploaded;
	@JsonProperty("downloaded")
	private Long downloaded;
	@JsonProperty("ratio")
	private Double ratio;
	@JsonProperty("requiredratio")
	private Double requiredratio;
	@JsonProperty("class")
	private String _class;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The requiredratio
	 */
	@JsonProperty("requiredratio")
	public Double getRequiredratio() {
		return requiredratio;
	}

	/**
	 * 
	 * @param requiredratio
	 *            The requiredratio
	 */
	@JsonProperty("requiredratio")
	public void setRequiredratio(Double requiredratio) {
		this.requiredratio = requiredratio;
	}

	/**
	 * 
	 * @return The _class
	 */
	@JsonProperty("class")
	public String getClass_() {
		return _class;
	}

	/**
	 * 
	 * @param _class
	 *            The class
	 */
	@JsonProperty("class")
	public void setClass_(String _class) {
		this._class = _class;
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
