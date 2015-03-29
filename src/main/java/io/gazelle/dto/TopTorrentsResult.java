
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
    "torrentId",
    "groupId",
    "artist",
    "groupName",
    "groupCategory",
    "groupYear",
    "remasterTitle",
    "format",
    "encoding",
    "hasLog",
    "hasCue",
    "media",
    "scene",
    "year",
    "tags",
    "snatched",
    "seeders",
    "leechers",
    "data"
})
public class TopTorrentsResult {

    @JsonProperty("torrentId")
    private Long torrentId;
    @JsonProperty("groupId")
    private Long groupId;
    @JsonProperty("artist")
    private String artist;
    @JsonProperty("groupName")
    private String groupName;
    @JsonProperty("groupCategory")
    private Long groupCategory;
    @JsonProperty("groupYear")
    private Long groupYear;
    @JsonProperty("remasterTitle")
    private String remasterTitle;
    @JsonProperty("format")
    private String format;
    @JsonProperty("encoding")
    private String encoding;
    @JsonProperty("hasLog")
    private Boolean hasLog;
    @JsonProperty("hasCue")
    private Boolean hasCue;
    @JsonProperty("media")
    private String media;
    @JsonProperty("scene")
    private Boolean scene;
    @JsonProperty("year")
    private Long year;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("snatched")
    private Long snatched;
    @JsonProperty("seeders")
    private Long seeders;
    @JsonProperty("leechers")
    private Long leechers;
    @JsonProperty("data")
    private Long data;
    @JsonIgnore
    @PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     * 
     * @return
     *     The torrentId
     */
    @JsonProperty("torrentId")
    public Long getTorrentId() {
        return torrentId;
    }

    /**
     * 
     * @param torrentId
     *     The torrentId
     */
    @JsonProperty("torrentId")
    public void setTorrentId(Long torrentId) {
        this.torrentId = torrentId;
    }

    /**
     * 
     * @return
     *     The groupId
     */
    @JsonProperty("groupId")
    public Long getGroupId() {
        return groupId;
    }

    /**
     * 
     * @param groupId
     *     The groupId
     */
    @JsonProperty("groupId")
    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    /**
     * 
     * @return
     *     The artist
     */
    @JsonProperty("artist")
    public String getArtist() {
        return artist;
    }

    /**
     * 
     * @param artist
     *     The artist
     */
    @JsonProperty("artist")
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * 
     * @return
     *     The groupName
     */
    @JsonProperty("groupName")
    public String getGroupName() {
        return groupName;
    }

    /**
     * 
     * @param groupName
     *     The groupName
     */
    @JsonProperty("groupName")
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * 
     * @return
     *     The groupCategory
     */
    @JsonProperty("groupCategory")
    public Long getGroupCategory() {
        return groupCategory;
    }

    /**
     * 
     * @param groupCategory
     *     The groupCategory
     */
    @JsonProperty("groupCategory")
    public void setGroupCategory(Long groupCategory) {
        this.groupCategory = groupCategory;
    }

    /**
     * 
     * @return
     *     The groupYear
     */
    @JsonProperty("groupYear")
    public Long getGroupYear() {
        return groupYear;
    }

    /**
     * 
     * @param groupYear
     *     The groupYear
     */
    @JsonProperty("groupYear")
    public void setGroupYear(Long groupYear) {
        this.groupYear = groupYear;
    }

    /**
     * 
     * @return
     *     The remasterTitle
     */
    @JsonProperty("remasterTitle")
    public String getRemasterTitle() {
        return remasterTitle;
    }

    /**
     * 
     * @param remasterTitle
     *     The remasterTitle
     */
    @JsonProperty("remasterTitle")
    public void setRemasterTitle(String remasterTitle) {
        this.remasterTitle = remasterTitle;
    }

    /**
     * 
     * @return
     *     The format
     */
    @JsonProperty("format")
    public String getFormat() {
        return format;
    }

    /**
     * 
     * @param format
     *     The format
     */
    @JsonProperty("format")
    public void setFormat(String format) {
        this.format = format;
    }

    /**
     * 
     * @return
     *     The encoding
     */
    @JsonProperty("encoding")
    public String getEncoding() {
        return encoding;
    }

    /**
     * 
     * @param encoding
     *     The encoding
     */
    @JsonProperty("encoding")
    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    /**
     * 
     * @return
     *     The hasLog
     */
    @JsonProperty("hasLog")
    public Boolean getHasLog() {
        return hasLog;
    }

    /**
     * 
     * @param hasLog
     *     The hasLog
     */
    @JsonProperty("hasLog")
    public void setHasLog(Boolean hasLog) {
        this.hasLog = hasLog;
    }

    /**
     * 
     * @return
     *     The hasCue
     */
    @JsonProperty("hasCue")
    public Boolean getHasCue() {
        return hasCue;
    }

    /**
     * 
     * @param hasCue
     *     The hasCue
     */
    @JsonProperty("hasCue")
    public void setHasCue(Boolean hasCue) {
        this.hasCue = hasCue;
    }

    /**
     * 
     * @return
     *     The media
     */
    @JsonProperty("media")
    public String getMedia() {
        return media;
    }

    /**
     * 
     * @param media
     *     The media
     */
    @JsonProperty("media")
    public void setMedia(String media) {
        this.media = media;
    }

    /**
     * 
     * @return
     *     The scene
     */
    @JsonProperty("scene")
    public Boolean getScene() {
        return scene;
    }

    /**
     * 
     * @param scene
     *     The scene
     */
    @JsonProperty("scene")
    public void setScene(Boolean scene) {
        this.scene = scene;
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
     *     The tags
     */
    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    /**
     * 
     * @param tags
     *     The tags
     */
    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * 
     * @return
     *     The snatched
     */
    @JsonProperty("snatched")
    public Long getSnatched() {
        return snatched;
    }

    /**
     * 
     * @param snatched
     *     The snatched
     */
    @JsonProperty("snatched")
    public void setSnatched(Long snatched) {
        this.snatched = snatched;
    }

    /**
     * 
     * @return
     *     The seeders
     */
    @JsonProperty("seeders")
    public Long getSeeders() {
        return seeders;
    }

    /**
     * 
     * @param seeders
     *     The seeders
     */
    @JsonProperty("seeders")
    public void setSeeders(Long seeders) {
        this.seeders = seeders;
    }

    /**
     * 
     * @return
     *     The leechers
     */
    @JsonProperty("leechers")
    public Long getLeechers() {
        return leechers;
    }

    /**
     * 
     * @param leechers
     *     The leechers
     */
    @JsonProperty("leechers")
    public void setLeechers(Long leechers) {
        this.leechers = leechers;
    }

    /**
     * 
     * @return
     *     The data
     */
    @JsonProperty("data")
    public Long getData() {
        return data;
    }

    /**
     * 
     * @param data
     *     The data
     */
    @JsonProperty("data")
    public void setData(Long data) {
        this.data = data;
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
