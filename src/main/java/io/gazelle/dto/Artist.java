
package io.gazelle.dto;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "id",
    "name",
    "notificationsEnabled",
    "hasBookmarked",
    "image",
    "body",
    "vanityHouse",
    "tags",
    "similarArtists",
    "statistics",
    "torrentgroup",
    "requests"
})
public class Artist {

    @JsonProperty("id")
    private Long id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("notificationsEnabled")
    private Boolean notificationsEnabled;
    @JsonProperty("hasBookmarked")
    private Boolean hasBookmarked;
    @JsonProperty("image")
    private String image;
    @JsonProperty("body")
    private String body;
    @JsonProperty("vanityHouse")
    private Boolean vanityHouse;
    @JsonProperty("tags")
    private List<Tag> tags = new ArrayList<Tag>();
    @JsonProperty("similarArtists")
    private List<SimilarArtist> similarArtists = new ArrayList<SimilarArtist>();
    @JsonProperty("statistics")
    private Statistics statistics;
    @JsonProperty("torrentgroup")
    private List<Torrentgroup> torrentgroup = new ArrayList<Torrentgroup>();
    @JsonProperty("requests")
    private List<Request> requests = new ArrayList<Request>();
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The id
     */
    @JsonProperty("id")
    public Long getId() {
        return id;
    }

    /**
     * 
     * @param id
     *     The id
     */
    @JsonProperty("id")
    public void setId(Long id) {
        this.id = id;
    }

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
     *     The notificationsEnabled
     */
    @JsonProperty("notificationsEnabled")
    public Boolean getNotificationsEnabled() {
        return notificationsEnabled;
    }

    /**
     * 
     * @param notificationsEnabled
     *     The notificationsEnabled
     */
    @JsonProperty("notificationsEnabled")
    public void setNotificationsEnabled(Boolean notificationsEnabled) {
        this.notificationsEnabled = notificationsEnabled;
    }

    /**
     * 
     * @return
     *     The hasBookmarked
     */
    @JsonProperty("hasBookmarked")
    public Boolean getHasBookmarked() {
        return hasBookmarked;
    }

    /**
     * 
     * @param hasBookmarked
     *     The hasBookmarked
     */
    @JsonProperty("hasBookmarked")
    public void setHasBookmarked(Boolean hasBookmarked) {
        this.hasBookmarked = hasBookmarked;
    }

    /**
     * 
     * @return
     *     The image
     */
    @JsonProperty("image")
    public String getImage() {
        return image;
    }

    /**
     * 
     * @param image
     *     The image
     */
    @JsonProperty("image")
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 
     * @return
     *     The body
     */
    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    /**
     * 
     * @param body
     *     The body
     */
    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    /**
     * 
     * @return
     *     The vanityHouse
     */
    @JsonProperty("vanityHouse")
    public Boolean getVanityHouse() {
        return vanityHouse;
    }

    /**
     * 
     * @param vanityHouse
     *     The vanityHouse
     */
    @JsonProperty("vanityHouse")
    public void setVanityHouse(Boolean vanityHouse) {
        this.vanityHouse = vanityHouse;
    }

    /**
     * 
     * @return
     *     The tags
     */
    @JsonProperty("tags")
    public List<Tag> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The similarArtists
     */
    @JsonProperty("similarArtists")
    public List<SimilarArtist> getSimilarArtists() {
        return similarArtists;
    }

    /**
     * 
     * @param similarArtists
     *     The similarArtists
     */
    @JsonProperty("similarArtists")
    public void setSimilarArtists(List<SimilarArtist> similarArtists) {
        this.similarArtists = similarArtists;
    }

    /**
     * 
     * @return
     *     The statistics
     */
    @JsonProperty("statistics")
    public Statistics getStatistics() {
        return statistics;
    }

    /**
     * 
     * @param statistics
     *     The statistics
     */
    @JsonProperty("statistics")
    public void setStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    /**
     * 
     * @return
     *     The torrentgroup
     */
    @JsonProperty("torrentgroup")
    public List<Torrentgroup> getTorrentgroup() {
        return torrentgroup;
    }

    /**
     * 
     * @param torrentgroup
     *     The torrentgroup
     */
    @JsonProperty("torrentgroup")
    public void setTorrentgroup(List<Torrentgroup> torrentgroup) {
        this.torrentgroup = torrentgroup;
    }

    /**
     * 
     * @return
     *     The requests
     */
    @JsonProperty("requests")
    public List<Request> getRequests() {
        return requests;
    }

    /**
     * 
     * @param requests
     *     The requests
     */
    @JsonProperty("requests")
    public void setRequests(List<Request> requests) {
        this.requests = requests;
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
