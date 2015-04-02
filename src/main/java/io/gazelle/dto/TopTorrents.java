package io.gazelle.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Generated;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import uk.co.jemos.podam.common.PodamCollection;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@AutoProperty
@JsonPropertyOrder({"status", "response"})
public class TopTorrents {

	@JsonProperty("status")
	private String status;
	@JsonProperty("response")
	private List<TopCategory<TopTorrentsResult>> response;

	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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

	/**
	 * @return the response
	 */
	public List<TopCategory<TopTorrentsResult>> getResponse() {
		return response;
	}
	
	

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @param response the response to set
	 */
	public void setResponse(List<TopCategory<TopTorrentsResult>> response) {
		this.response = response;
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
