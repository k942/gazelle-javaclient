
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
    "uploaded",
    "downloaded",
    "uploads",
    "requests",
    "bounty",
    "posts",
    "artists",
    "overall"
})
public class Ranks {

    @JsonProperty("uploaded")
    private Long uploaded;
    @JsonProperty("downloaded")
    private Long downloaded;
    @JsonProperty("uploads")
    private Long uploads;
    @JsonProperty("requests")
    private Long requests;
    @JsonProperty("bounty")
    private Long bounty;
    @JsonProperty("posts")
    private Long posts;
    @JsonProperty("artists")
    private Long artists;
    @JsonProperty("overall")
    private Long overall;
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The uploaded
     */
    @JsonProperty("uploaded")
    public Long getUploaded() {
        return uploaded;
    }

    /**
     * 
     * @param uploaded
     *     The uploaded
     */
    @JsonProperty("uploaded")
    public void setUploaded(Long uploaded) {
        this.uploaded = uploaded;
    }

    /**
     * 
     * @return
     *     The downloaded
     */
    @JsonProperty("downloaded")
    public Long getDownloaded() {
        return downloaded;
    }

    /**
     * 
     * @param downloaded
     *     The downloaded
     */
    @JsonProperty("downloaded")
    public void setDownloaded(Long downloaded) {
        this.downloaded = downloaded;
    }

    /**
     * 
     * @return
     *     The uploads
     */
    @JsonProperty("uploads")
    public Long getUploads() {
        return uploads;
    }

    /**
     * 
     * @param uploads
     *     The uploads
     */
    @JsonProperty("uploads")
    public void setUploads(Long uploads) {
        this.uploads = uploads;
    }

    /**
     * 
     * @return
     *     The requests
     */
    @JsonProperty("requests")
    public Long getRequests() {
        return requests;
    }

    /**
     * 
     * @param requests
     *     The requests
     */
    @JsonProperty("requests")
    public void setRequests(Long requests) {
        this.requests = requests;
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

    /**
     * 
     * @return
     *     The posts
     */
    @JsonProperty("posts")
    public Long getPosts() {
        return posts;
    }

    /**
     * 
     * @param posts
     *     The posts
     */
    @JsonProperty("posts")
    public void setPosts(Long posts) {
        this.posts = posts;
    }

    /**
     * 
     * @return
     *     The artists
     */
    @JsonProperty("artists")
    public Long getArtists() {
        return artists;
    }

    /**
     * 
     * @param artists
     *     The artists
     */
    @JsonProperty("artists")
    public void setArtists(Long artists) {
        this.artists = artists;
    }

    /**
     * 
     * @return
     *     The overall
     */
    @JsonProperty("overall")
    public Long getOverall() {
        return overall;
    }

    /**
     * 
     * @param overall
     *     The overall
     */
    @JsonProperty("overall")
    public void setOverall(Long overall) {
        this.overall = overall;
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
