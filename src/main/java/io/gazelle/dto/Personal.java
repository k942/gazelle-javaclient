
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
    "class",
    "paranoia",
    "paranoiaText",
    "donor",
    "warned",
    "enabled",
    "passkey"
})
public class Personal {

    @JsonProperty("class")
    private String _class;
    @JsonProperty("paranoia")
    private Long paranoia;
    @JsonProperty("paranoiaText")
    private String paranoiaText;
    @JsonProperty("donor")
    private Boolean donor;
    @JsonProperty("warned")
    private Boolean warned;
    @JsonProperty("enabled")
    private Boolean enabled;
    @JsonProperty("passkey")
    private String passkey;
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The _class
     */
    @JsonProperty("class")
    public String getClass_() {
        return _class;
    }

    /**
     * 
     * @param _class
     *     The class
     */
    @JsonProperty("class")
    public void setClass_(String _class) {
        this._class = _class;
    }

    /**
     * 
     * @return
     *     The paranoia
     */
    @JsonProperty("paranoia")
    public Long getParanoia() {
        return paranoia;
    }

    /**
     * 
     * @param paranoia
     *     The paranoia
     */
    @JsonProperty("paranoia")
    public void setParanoia(Long paranoia) {
        this.paranoia = paranoia;
    }

    /**
     * 
     * @return
     *     The paranoiaText
     */
    @JsonProperty("paranoiaText")
    public String getParanoiaText() {
        return paranoiaText;
    }

    /**
     * 
     * @param paranoiaText
     *     The paranoiaText
     */
    @JsonProperty("paranoiaText")
    public void setParanoiaText(String paranoiaText) {
        this.paranoiaText = paranoiaText;
    }

    /**
     * 
     * @return
     *     The donor
     */
    @JsonProperty("donor")
    public Boolean getDonor() {
        return donor;
    }

    /**
     * 
     * @param donor
     *     The donor
     */
    @JsonProperty("donor")
    public void setDonor(Boolean donor) {
        this.donor = donor;
    }

    /**
     * 
     * @return
     *     The warned
     */
    @JsonProperty("warned")
    public Boolean getWarned() {
        return warned;
    }

    /**
     * 
     * @param warned
     *     The warned
     */
    @JsonProperty("warned")
    public void setWarned(Boolean warned) {
        this.warned = warned;
    }

    /**
     * 
     * @return
     *     The enabled
     */
    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    /**
     * 
     * @param enabled
     *     The enabled
     */
    @JsonProperty("enabled")
    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    /**
     * 
     * @return
     *     The passkey
     */
    @JsonProperty("passkey")
    public String getPasskey() {
        return passkey;
    }

    /**
     * 
     * @param passkey
     *     The passkey
     */
    @JsonProperty("passkey")
    public void setPasskey(String passkey) {
        this.passkey = passkey;
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
