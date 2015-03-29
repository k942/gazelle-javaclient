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
@JsonPropertyOrder({"id", "groupId", "media", "format", "encoding", "remasterYear", "remastered", "remasterTitle",
		"remasterRecordLabel", "scene", "hasLog", "hasCue", "logScore", "fileCount", "freeTorrent", "size", "leechers",
		"seeders", "snatched", "time", "hasFile"})
public class Torrent {

	@JsonProperty("id")
	private Long id;
	@JsonProperty("groupId")
	private Long groupId;
	@JsonProperty("media")
	private String media;
	@JsonProperty("format")
	private String format;
	@JsonProperty("encoding")
	private String encoding;
	@JsonProperty("remasterYear")
	private Long remasterYear;
	@JsonProperty("remastered")
	private Boolean remastered;
	@JsonProperty("remasterTitle")
	private String remasterTitle;
	@JsonProperty("remasterRecordLabel")
	private String remasterRecordLabel;
	@JsonProperty("scene")
	private Boolean scene;
	@JsonProperty("hasLog")
	private Boolean hasLog;
	@JsonProperty("hasCue")
	private Boolean hasCue;
	@JsonProperty("logScore")
	private Long logScore;
	@JsonProperty("fileCount")
	private Long fileCount;
	@JsonProperty("freeTorrent")
	private Boolean freeTorrent;
	@JsonProperty("size")
	private Long size;
	@JsonProperty("leechers")
	private Long leechers;
	@JsonProperty("seeders")
	private Long seeders;
	@JsonProperty("snatched")
	private Long snatched;
	@JsonProperty("time")
	private String time;
	@JsonProperty("hasFile")
	private Long hasFile;
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public Long getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The groupId
	 */
	@JsonProperty("groupId")
	public Long getGroupId() {
		return groupId;
	}

	/**
	 * 
	 * @param groupId
	 *            The groupId
	 */
	@JsonProperty("groupId")
	public void setGroupId(Long groupId) {
		this.groupId = groupId;
	}

	/**
	 * 
	 * @return The media
	 */
	@JsonProperty("media")
	public String getMedia() {
		return media;
	}

	/**
	 * 
	 * @param media
	 *            The media
	 */
	@JsonProperty("media")
	public void setMedia(String media) {
		this.media = media;
	}

	/**
	 * 
	 * @return The format
	 */
	@JsonProperty("format")
	public String getFormat() {
		return format;
	}

	/**
	 * 
	 * @param format
	 *            The format
	 */
	@JsonProperty("format")
	public void setFormat(String format) {
		this.format = format;
	}

	/**
	 * 
	 * @return The encoding
	 */
	@JsonProperty("encoding")
	public String getEncoding() {
		return encoding;
	}

	/**
	 * 
	 * @param encoding
	 *            The encoding
	 */
	@JsonProperty("encoding")
	public void setEncoding(String encoding) {
		this.encoding = encoding;
	}

	/**
	 * 
	 * @return The remasterYear
	 */
	@JsonProperty("remasterYear")
	public Long getRemasterYear() {
		return remasterYear;
	}

	/**
	 * 
	 * @param remasterYear
	 *            The remasterYear
	 */
	@JsonProperty("remasterYear")
	public void setRemasterYear(Long remasterYear) {
		this.remasterYear = remasterYear;
	}

	/**
	 * 
	 * @return The remastered
	 */
	@JsonProperty("remastered")
	public Boolean getRemastered() {
		return remastered;
	}

	/**
	 * 
	 * @param remastered
	 *            The remastered
	 */
	@JsonProperty("remastered")
	public void setRemastered(Boolean remastered) {
		this.remastered = remastered;
	}

	/**
	 * 
	 * @return The remasterTitle
	 */
	@JsonProperty("remasterTitle")
	public String getRemasterTitle() {
		return remasterTitle;
	}

	/**
	 * 
	 * @param remasterTitle
	 *            The remasterTitle
	 */
	@JsonProperty("remasterTitle")
	public void setRemasterTitle(String remasterTitle) {
		this.remasterTitle = remasterTitle;
	}

	/**
	 * 
	 * @return The remasterRecordLabel
	 */
	@JsonProperty("remasterRecordLabel")
	public String getRemasterRecordLabel() {
		return remasterRecordLabel;
	}

	/**
	 * 
	 * @param remasterRecordLabel
	 *            The remasterRecordLabel
	 */
	@JsonProperty("remasterRecordLabel")
	public void setRemasterRecordLabel(String remasterRecordLabel) {
		this.remasterRecordLabel = remasterRecordLabel;
	}

	/**
	 * 
	 * @return The scene
	 */
	@JsonProperty("scene")
	public Boolean getScene() {
		return scene;
	}

	/**
	 * 
	 * @param scene
	 *            The scene
	 */
	@JsonProperty("scene")
	public void setScene(Boolean scene) {
		this.scene = scene;
	}

	/**
	 * 
	 * @return The hasLog
	 */
	@JsonProperty("hasLog")
	public Boolean getHasLog() {
		return hasLog;
	}

	/**
	 * 
	 * @param hasLog
	 *            The hasLog
	 */
	@JsonProperty("hasLog")
	public void setHasLog(Boolean hasLog) {
		this.hasLog = hasLog;
	}

	/**
	 * 
	 * @return The hasCue
	 */
	@JsonProperty("hasCue")
	public Boolean getHasCue() {
		return hasCue;
	}

	/**
	 * 
	 * @param hasCue
	 *            The hasCue
	 */
	@JsonProperty("hasCue")
	public void setHasCue(Boolean hasCue) {
		this.hasCue = hasCue;
	}

	/**
	 * 
	 * @return The logScore
	 */
	@JsonProperty("logScore")
	public Long getLogScore() {
		return logScore;
	}

	/**
	 * 
	 * @param logScore
	 *            The logScore
	 */
	@JsonProperty("logScore")
	public void setLogScore(Long logScore) {
		this.logScore = logScore;
	}

	/**
	 * 
	 * @return The fileCount
	 */
	@JsonProperty("fileCount")
	public Long getFileCount() {
		return fileCount;
	}

	/**
	 * 
	 * @param fileCount
	 *            The fileCount
	 */
	@JsonProperty("fileCount")
	public void setFileCount(Long fileCount) {
		this.fileCount = fileCount;
	}

	/**
	 * 
	 * @return The freeTorrent
	 */
	@JsonProperty("freeTorrent")
	public Boolean getFreeTorrent() {
		return freeTorrent;
	}

	/**
	 * 
	 * @param freeTorrent
	 *            The freeTorrent
	 */
	@JsonProperty("freeTorrent")
	public void setFreeTorrent(Boolean freeTorrent) {
		this.freeTorrent = freeTorrent;
	}

	/**
	 * 
	 * @return The size
	 */
	@JsonProperty("size")
	public Long getSize() {
		return size;
	}

	/**
	 * 
	 * @param size
	 *            The size
	 */
	@JsonProperty("size")
	public void setSize(Long size) {
		this.size = size;
	}

	/**
	 * 
	 * @return The leechers
	 */
	@JsonProperty("leechers")
	public Long getLeechers() {
		return leechers;
	}

	/**
	 * 
	 * @param leechers
	 *            The leechers
	 */
	@JsonProperty("leechers")
	public void setLeechers(Long leechers) {
		this.leechers = leechers;
	}

	/**
	 * 
	 * @return The seeders
	 */
	@JsonProperty("seeders")
	public Long getSeeders() {
		return seeders;
	}

	/**
	 * 
	 * @param seeders
	 *            The seeders
	 */
	@JsonProperty("seeders")
	public void setSeeders(Long seeders) {
		this.seeders = seeders;
	}

	/**
	 * 
	 * @return The snatched
	 */
	@JsonProperty("snatched")
	public Long getSnatched() {
		return snatched;
	}

	/**
	 * 
	 * @param snatched
	 *            The snatched
	 */
	@JsonProperty("snatched")
	public void setSnatched(Long snatched) {
		this.snatched = snatched;
	}

	/**
	 * 
	 * @return The time
	 */
	@JsonProperty("time")
	public String getTime() {
		return time;
	}

	/**
	 * 
	 * @param time
	 *            The time
	 */
	@JsonProperty("time")
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * 
	 * @return The hasFile
	 */
	@JsonProperty("hasFile")
	public Long getHasFile() {
		return hasFile;
	}

	/**
	 * 
	 * @param hasFile
	 *            The hasFile
	 */
	@JsonProperty("hasFile")
	public void setHasFile(Long hasFile) {
		this.hasFile = hasFile;
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
