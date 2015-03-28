
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
    "numGroups",
    "numTorrents",
    "numSeeders",
    "numLeechers",
    "numSnatches"
})
public class Statistics {

    @JsonProperty("numGroups")
    private Long numGroups;
    @JsonProperty("numTorrents")
    private Long numTorrents;
    @JsonProperty("numSeeders")
    private Long numSeeders;
    @JsonProperty("numLeechers")
    private Long numLeechers;
    @JsonProperty("numSnatches")
    private Long numSnatches;
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The numGroups
     */
    @JsonProperty("numGroups")
    public Long getNumGroups() {
        return numGroups;
    }

    /**
     * 
     * @param numGroups
     *     The numGroups
     */
    @JsonProperty("numGroups")
    public void setNumGroups(Long numGroups) {
        this.numGroups = numGroups;
    }

    /**
     * 
     * @return
     *     The numTorrents
     */
    @JsonProperty("numTorrents")
    public Long getNumTorrents() {
        return numTorrents;
    }

    /**
     * 
     * @param numTorrents
     *     The numTorrents
     */
    @JsonProperty("numTorrents")
    public void setNumTorrents(Long numTorrents) {
        this.numTorrents = numTorrents;
    }

    /**
     * 
     * @return
     *     The numSeeders
     */
    @JsonProperty("numSeeders")
    public Long getNumSeeders() {
        return numSeeders;
    }

    /**
     * 
     * @param numSeeders
     *     The numSeeders
     */
    @JsonProperty("numSeeders")
    public void setNumSeeders(Long numSeeders) {
        this.numSeeders = numSeeders;
    }

    /**
     * 
     * @return
     *     The numLeechers
     */
    @JsonProperty("numLeechers")
    public Long getNumLeechers() {
        return numLeechers;
    }

    /**
     * 
     * @param numLeechers
     *     The numLeechers
     */
    @JsonProperty("numLeechers")
    public void setNumLeechers(Long numLeechers) {
        this.numLeechers = numLeechers;
    }

    /**
     * 
     * @return
     *     The numSnatches
     */
    @JsonProperty("numSnatches")
    public Long getNumSnatches() {
        return numSnatches;
    }

    /**
     * 
     * @param numSnatches
     *     The numSnatches
     */
    @JsonProperty("numSnatches")
    public void setNumSnatches(Long numSnatches) {
        this.numSnatches = numSnatches;
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
