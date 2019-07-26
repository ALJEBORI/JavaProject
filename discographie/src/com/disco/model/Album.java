package com.disco.model;


public class Album {
	private Long id;
	private String title;
	private int releaseYear;
	private Artist artist;
	
	public Artist getArtist() {
		return artist;
	}

	public void setArtist(Artist artist) {
		this.artist = artist;
	}

	public Album(String title, int releaseYear, Artist artist) {
		super();
		this.title = title;
		this.releaseYear = releaseYear;
		this.artist = artist;
	}
	public Album(Long id, String title, int releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
	}
	
	public Album(Long id, String title, int releaseYear, Artist artist) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}
	
}
