
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
    "name",
    "uses",
    "posVotes",
    "negVotes"
})
public class TopTagsResult {

    @JsonProperty("name")
    private String name;
    @JsonProperty("uses")
    private Long uses;
    @JsonProperty("posVotes")
    private Long posVotes;
    @JsonProperty("negVotes")
    private Long negVotes;
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The name
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     * @param name
     *     The name
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     * @return
     *     The uses
     */
    @JsonProperty("uses")
    public Long getUses() {
        return uses;
    }

    /**
     * 
     * @param uses
     *     The uses
     */
    @JsonProperty("uses")
    public void setUses(Long uses) {
        this.uses = uses;
    }

    /**
     * 
     * @return
     *     The posVotes
     */
    @JsonProperty("posVotes")
    public Long getPosVotes() {
        return posVotes;
    }

    /**
     * 
     * @param posVotes
     *     The posVotes
     */
    @JsonProperty("posVotes")
    public void setPosVotes(Long posVotes) {
        this.posVotes = posVotes;
    }

    /**
     * 
     * @return
     *     The negVotes
     */
    @JsonProperty("negVotes")
    public Long getNegVotes() {
        return negVotes;
    }

    /**
     * 
     * @param negVotes
     *     The negVotes
     */
    @JsonProperty("negVotes")
    public void setNegVotes(Long negVotes) {
        this.negVotes = negVotes;
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
