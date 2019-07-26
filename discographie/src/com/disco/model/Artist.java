package com.disco.model;

import java.util.ArrayList;
import java.util.List;

public class Artist {
	private String bandName;
	private String firstName;
	private String lastName;
	private SacemRegistration sacemRegistration;
	private List<Album> albums = new ArrayList<>();

	
	public Artist(String bandName, String firstName, String lastName, SacemRegistration sacemRegistration) {
		this.bandName = bandName;
		this.firstName = firstName;
		this.lastName = lastName;
		this.sacemRegistration = sacemRegistration;
	}

	public Artist(String bandName, String firstName, String lastName) {
		this.bandName = bandName;
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getBandName() {
		return bandName;
	}

	public void setBandName(String bandName) {
		this.bandName = bandName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public List<Album> getAlbums() {
		return albums;
	}

	public void setAlbums(List<Album> albums) {
		this.albums = albums;
	}
	
	public SacemRegistration getSacemRegistration() {
		return sacemRegistration;
	}

	public void setSacemRegistration(SacemRegistration sacemRegistration) {
		this.sacemRegistration = sacemRegistration;
	}
	
	@Override
	public String toString() {
		return "Artist [bandName=" + bandName + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	
	
	
}
