//$Id$
package com.zmovizz.models;

public class Movie{
	private int id;
	private String name;
	private String actor;
	private int genere;
	private String description;
	private long releaseDate;
	private byte[] image;	
	private long duration;
	private int language;
	
	
	public int getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public int getGenere() {
		return genere;
	}
	public void setGenere(Integer genere) {
		this.genere = genere;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getReleaseDate() {
		return releaseDate;
	}
	public void setReleaseDate(Long releaseDate) {
		this.releaseDate = releaseDate;
	}
	public byte[] getImage() {
		return image;
	}
	public void setImage(byte[] image) {
		this.image = image;
	}
	public long getDuration() {
		return duration;
	}
	public void setDuration(Long duration) {
		this.duration = duration;
	}
	public int getLanguage() {
		return language;
	}
	public void setLanguage(Integer language) {
		this.language = language;
	}


}
