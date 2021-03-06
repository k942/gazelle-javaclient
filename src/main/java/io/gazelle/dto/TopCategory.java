package io.gazelle.dto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.pojomatic.Pojomatic;
import org.pojomatic.annotations.AutoProperty;

import uk.co.jemos.podam.common.PodamCollection;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;

@AutoProperty
public class TopCategory<T> {

	private String caption;
	private Long limit;
	private List<T> results;
	private String tag;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	public String getCaption() {
		return this.caption;
	}

	public Long getLimit() {
		return this.limit;
	}

	public List<T> getResults() {
		return this.results;
	}
	
	

	/**
	 * @param caption the caption to set
	 */
	public void setCaption(String caption) {
		this.caption = caption;
	}

	/**
	 * @param limit the limit to set
	 */
	public void setLimit(Long limit) {
		this.limit = limit;
	}

	/**
	 * @param results the results to set
	 */
	public void setResults(List<T> results) {
		this.results = results;
	}

	/**
	 * @param tag the tag to set
	 */
	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getTag() {
		return this.tag;
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