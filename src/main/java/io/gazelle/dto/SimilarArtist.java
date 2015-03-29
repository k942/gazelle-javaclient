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
@JsonPropertyOrder({"artistId", "name", "score", "similarId"})
public class SimilarArtist {

	@JsonProperty("artistId")
	private Long artistId;
	@JsonProperty("name")
	private String name;
	@JsonProperty("score")
	private Long score;
	@JsonProperty("similarId")
	private Long similarId;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The artistId
	 */
	@JsonProperty("artistId")
	public Long getArtistId() {
		return artistId;
	}

	/**
	 * 
	 * @param artistId
	 *            The artistId
	 */
	@JsonProperty("artistId")
	public void setArtistId(Long artistId) {
		this.artistId = artistId;
	}

	/**
	 * 
	 * @return The name
	 */
	@JsonProperty("name")
	public String getName() {
		return name;
	}

	/**
	 * 
	 * @param name
	 *            The name
	 */
	@JsonProperty("name")
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * 
	 * @return The score
	 */
	@JsonProperty("score")
	public Long getScore() {
		return score;
	}

	/**
	 * 
	 * @param score
	 *            The score
	 */
	@JsonProperty("score")
	public void setScore(Long score) {
		this.score = score;
	}

	/**
	 * 
	 * @return The similarId
	 */
	@JsonProperty("similarId")
	public Long getSimilarId() {
		return similarId;
	}

	/**
	 * 
	 * @param similarId
	 *            The similarId
	 */
	@JsonProperty("similarId")
	public void setSimilarId(Long similarId) {
		this.similarId = similarId;
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
