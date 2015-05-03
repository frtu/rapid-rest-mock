package com.github.frtu.catalog.model;

import java.util.HashMap;
import java.util.Map;
import javax.annotation.Generated;
import javax.persistence.Entity;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@Entity
@JsonInclude(JsonInclude.Include.NON_NULL)
@Generated("org.jsonschema2pojo")
@JsonPropertyOrder({ "adult", "backdrop_path", "id", "original_title", "release_date", "poster_path", "popularity", "title", "video",
		"vote_average", "vote_count" })
public class Result {
	@Id @JsonProperty("id")
	private Integer id;
	
	@JsonProperty("adult")
	private Boolean adult;

	@JsonProperty("backdrop_path")
	private String backdropPath;
	
	@JsonProperty("original_title")
	private String originalTitle;
	
	@JsonProperty("release_date")
	private String releaseDate;
	
	@JsonProperty("poster_path")
	private String posterPath;
	
	@JsonProperty("popularity")
	private Double popularity;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("video")
	private Boolean video;
	
	@JsonProperty("vote_average")
	private Double voteAverage;
	
	@JsonProperty("vote_count")
	private Integer voteCount;
	
//	@JsonIgnore
//	private Map<String, Object> additionalProperties = new HashMap<String, Object>();

	/**
	 * 
	 * @return The adult
	 */
	@JsonProperty("adult")
	public Boolean getAdult() {
		return adult;
	}

	/**
	 * 
	 * @param adult
	 *            The adult
	 */
	@JsonProperty("adult")
	public void setAdult(Boolean adult) {
		this.adult = adult;
	}

	/**
	 * 
	 * @return The backdropPath
	 */
	@JsonProperty("backdrop_path")
	public String getBackdropPath() {
		return backdropPath;
	}

	/**
	 * 
	 * @param backdropPath
	 *            The backdrop_path
	 */
	@JsonProperty("backdrop_path")
	public void setBackdropPath(String backdropPath) {
		this.backdropPath = backdropPath;
	}

	/**
	 * 
	 * @return The id
	 */
	@JsonProperty("id")
	public Integer getId() {
		return id;
	}

	/**
	 * 
	 * @param id
	 *            The id
	 */
	@JsonProperty("id")
	public void setId(Integer id) {
		this.id = id;
	}

	/**
	 * 
	 * @return The originalTitle
	 */
	@JsonProperty("original_title")
	public String getOriginalTitle() {
		return originalTitle;
	}

	/**
	 * 
	 * @param originalTitle
	 *            The original_title
	 */
	@JsonProperty("original_title")
	public void setOriginalTitle(String originalTitle) {
		this.originalTitle = originalTitle;
	}

	/**
	 * 
	 * @return The releaseDate
	 */
	@JsonProperty("release_date")
	public String getReleaseDate() {
		return releaseDate;
	}

	/**
	 * 
	 * @param releaseDate
	 *            The release_date
	 */
	@JsonProperty("release_date")
	public void setReleaseDate(String releaseDate) {
		this.releaseDate = releaseDate;
	}

	/**
	 * 
	 * @return The posterPath
	 */
	@JsonProperty("poster_path")
	public String getPosterPath() {
		return posterPath;
	}

	/**
	 * 
	 * @param posterPath
	 *            The poster_path
	 */
	@JsonProperty("poster_path")
	public void setPosterPath(String posterPath) {
		this.posterPath = posterPath;
	}

	/**
	 * 
	 * @return The popularity
	 */
	@JsonProperty("popularity")
	public Double getPopularity() {
		return popularity;
	}

	/**
	 * 
	 * @param popularity
	 *            The popularity
	 */
	@JsonProperty("popularity")
	public void setPopularity(Double popularity) {
		this.popularity = popularity;
	}

	/**
	 * 
	 * @return The title
	 */
	@JsonProperty("title")
	public String getTitle() {
		return title;
	}

	/**
	 * 
	 * @param title
	 *            The title
	 */
	@JsonProperty("title")
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * 
	 * @return The video
	 */
	@JsonProperty("video")
	public Boolean getVideo() {
		return video;
	}

	/**
	 * 
	 * @param video
	 *            The video
	 */
	@JsonProperty("video")
	public void setVideo(Boolean video) {
		this.video = video;
	}

	/**
	 * 
	 * @return The voteAverage
	 */
	@JsonProperty("vote_average")
	public Double getVoteAverage() {
		return voteAverage;
	}

	/**
	 * 
	 * @param voteAverage
	 *            The vote_average
	 */
	@JsonProperty("vote_average")
	public void setVoteAverage(Double voteAverage) {
		this.voteAverage = voteAverage;
	}

	/**
	 * 
	 * @return The voteCount
	 */
	@JsonProperty("vote_count")
	public Integer getVoteCount() {
		return voteCount;
	}

	/**
	 * 
	 * @param voteCount
	 *            The vote_count
	 */
	@JsonProperty("vote_count")
	public void setVoteCount(Integer voteCount) {
		this.voteCount = voteCount;
	}

//	@JsonAnyGetter
//	public Map<String, Object> getAdditionalProperties() {
//		return this.additionalProperties;
//	}
//
//	@JsonAnySetter
//	public void setAdditionalProperty(String name, Object value) {
//		this.additionalProperties.put(name, value);
//	}

}
