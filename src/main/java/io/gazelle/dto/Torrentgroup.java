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
@JsonPropertyOrder({"groupId", "groupName", "groupYear", "groupRecordLabel", "groupCatalogueNumber", "groupCategoryID",
		"tags", "releaseType", "wikiImage", "groupVanityHouse", "hasBookmarked", "artists", "torrent"})
public class Torrentgroup {

	@JsonProperty("groupId")
	private Long groupId;
	@JsonProperty("groupName")
	private String groupName;
	@JsonProperty("groupYear")
	private Long groupYear;
	@JsonProperty("groupRecordLabel")
	private String groupRecordLabel;
	@JsonProperty("groupCatalogueNumber")
	private String groupCatalogueNumber;
	@JsonProperty("groupCategoryID")
	private String groupCategoryID;
	@JsonProperty("tags")
	private List<String> tags = new ArrayList<String>();
	@JsonProperty("releaseType")
	private Long releaseType;
	@JsonProperty("wikiImage")
	private String wikiImage;
	@JsonProperty("groupVanityHouse")
	private Boolean groupVanityHouse;
	@JsonProperty("hasBookmarked")
	private Boolean hasBookmarked;
	@JsonProperty("artists")
	private List<TorrentGroupArtist> artists = new ArrayList<TorrentGroupArtist>();
	@JsonProperty("torrent")
	private List<Torrent> torrent = new ArrayList<Torrent>();
	@JsonIgnore
	@PodamCollection(nbrElements = 2, mapElementStrategy = io.gazelle.utils.GazellePodamStrategy.class)
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

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
	 * @return The groupName
	 */
	@JsonProperty("groupName")
	public String getGroupName() {
		return groupName;
	}

	/**
	 * 
	 * @param groupName
	 *            The groupName
	 */
	@JsonProperty("groupName")
	public void setGroupName(String groupName) {
		this.groupName = groupName;
	}

	/**
	 * 
	 * @return The groupYear
	 */
	@JsonProperty("groupYear")
	public Long getGroupYear() {
		return groupYear;
	}

	/**
	 * 
	 * @param groupYear
	 *            The groupYear
	 */
	@JsonProperty("groupYear")
	public void setGroupYear(Long groupYear) {
		this.groupYear = groupYear;
	}

	/**
	 * 
	 * @return The groupRecordLabel
	 */
	@JsonProperty("groupRecordLabel")
	public String getGroupRecordLabel() {
		return groupRecordLabel;
	}

	/**
	 * 
	 * @param groupRecordLabel
	 *            The groupRecordLabel
	 */
	@JsonProperty("groupRecordLabel")
	public void setGroupRecordLabel(String groupRecordLabel) {
		this.groupRecordLabel = groupRecordLabel;
	}

	/**
	 * 
	 * @return The groupCatalogueNumber
	 */
	@JsonProperty("groupCatalogueNumber")
	public String getGroupCatalogueNumber() {
		return groupCatalogueNumber;
	}

	/**
	 * 
	 * @param groupCatalogueNumber
	 *            The groupCatalogueNumber
	 */
	@JsonProperty("groupCatalogueNumber")
	public void setGroupCatalogueNumber(String groupCatalogueNumber) {
		this.groupCatalogueNumber = groupCatalogueNumber;
	}

	/**
	 * 
	 * @return The groupCategoryID
	 */
	@JsonProperty("groupCategoryID")
	public String getGroupCategoryID() {
		return groupCategoryID;
	}

	/**
	 * 
	 * @param groupCategoryID
	 *            The groupCategoryID
	 */
	@JsonProperty("groupCategoryID")
	public void setGroupCategoryID(String groupCategoryID) {
		this.groupCategoryID = groupCategoryID;
	}

	/**
	 * 
	 * @return The tags
	 */
	@JsonProperty("tags")
	public List<String> getTags() {
		return tags;
	}

	/**
	 * 
	 * @param tags
	 *            The tags
	 */
	@JsonProperty("tags")
	public void setTags(List<String> tags) {
		this.tags = tags;
	}

	/**
	 * 
	 * @return The releaseType
	 */
	@JsonProperty("releaseType")
	public Long getReleaseType() {
		return releaseType;
	}

	/**
	 * 
	 * @param releaseType
	 *            The releaseType
	 */
	@JsonProperty("releaseType")
	public void setReleaseType(Long releaseType) {
		this.releaseType = releaseType;
	}

	/**
	 * 
	 * @return The wikiImage
	 */
	@JsonProperty("wikiImage")
	public String getWikiImage() {
		return wikiImage;
	}

	/**
	 * 
	 * @param wikiImage
	 *            The wikiImage
	 */
	@JsonProperty("wikiImage")
	public void setWikiImage(String wikiImage) {
		this.wikiImage = wikiImage;
	}

	/**
	 * 
	 * @return The groupVanityHouse
	 */
	@JsonProperty("groupVanityHouse")
	public Boolean getGroupVanityHouse() {
		return groupVanityHouse;
	}

	/**
	 * 
	 * @param groupVanityHouse
	 *            The groupVanityHouse
	 */
	@JsonProperty("groupVanityHouse")
	public void setGroupVanityHouse(Boolean groupVanityHouse) {
		this.groupVanityHouse = groupVanityHouse;
	}

	/**
	 * 
	 * @return The hasBookmarked
	 */
	@JsonProperty("hasBookmarked")
	public Boolean getHasBookmarked() {
		return hasBookmarked;
	}

	/**
	 * 
	 * @param hasBookmarked
	 *            The hasBookmarked
	 */
	@JsonProperty("hasBookmarked")
	public void setHasBookmarked(Boolean hasBookmarked) {
		this.hasBookmarked = hasBookmarked;
	}

	/**
	 * 
	 * @return The artists
	 */
	@JsonProperty("artists")
	public List<TorrentGroupArtist> getArtists() {
		return artists;
	}

	/**
	 * 
	 * @param artists
	 *            The artists
	 */
	@JsonProperty("artists")
	public void setArtists(List<TorrentGroupArtist> artists) {
		this.artists = artists;
	}

	/**
	 * 
	 * @return The torrent
	 */
	@JsonProperty("torrent")
	public List<Torrent> getTorrent() {
		return torrent;
	}

	/**
	 * 
	 * @param torrent
	 *            The torrent
	 */
	@JsonProperty("torrent")
	public void setTorrent(List<Torrent> torrent) {
		this.torrent = torrent;
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
