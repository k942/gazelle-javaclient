
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
@JsonPropertyOrder({
    "requestId",
    "categoryId",
    "title",
    "year",
    "timeAdded",
    "votes",
    "bounty"
})
public class Request {

    @JsonProperty("requestId")
    private Long requestId;
    @JsonProperty("categoryId")
    private Long categoryId;
    @JsonProperty("title")
    private String title;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("timeAdded")
    private String timeAdded;
    @JsonProperty("votes")
    private Long votes;
    @JsonProperty("bounty")
    private Long bounty;
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The requestId
     */
    @JsonProperty("requestId")
    public Long getRequestId() {
        return requestId;
    }

    /**
     * 
     * @param requestId
     *     The requestId
     */
    @JsonProperty("requestId")
    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    /**
     * 
     * @return
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public Long getCategoryId() {
        return categoryId;
    }

    /**
     * 
     * @param categoryId
     *     The categoryId
     */
    @JsonProperty("categoryId")
    public void setCategoryId(Long categoryId) {
        this.categoryId = categoryId;
    }

    /**
     * 
     * @return
     *     The title
     */
    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    /**
     * 
     * @param title
     *     The title
     */
    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * 
     * @return
     *     The year
     */
    @JsonProperty("year")
    public Long getYear() {
        return year;
    }

    /**
     * 
     * @param year
     *     The year
     */
    @JsonProperty("year")
    public void setYear(Long year) {
        this.year = year;
    }

    /**
     * 
     * @return
     *     The timeAdded
     */
    @JsonProperty("timeAdded")
    public String getTimeAdded() {
        return timeAdded;
    }

    /**
     * 
     * @param timeAdded
     *     The timeAdded
     */
    @JsonProperty("timeAdded")
    public void setTimeAdded(String timeAdded) {
        this.timeAdded = timeAdded;
    }

    /**
     * 
     * @return
     *     The votes
     */
    @JsonProperty("votes")
    public Long getVotes() {
        return votes;
    }

    /**
     * 
     * @param votes
     *     The votes
     */
    @JsonProperty("votes")
    public void setVotes(Long votes) {
        this.votes = votes;
    }

    /**
     * 
     * @return
     *     The bounty
     */
    @JsonProperty("bounty")
    public Long getBounty() {
        return bounty;
    }

    /**
     * 
     * @param bounty
     *     The bounty
     */
    @JsonProperty("bounty")
    public void setBounty(Long bounty) {
        this.bounty = bounty;
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
