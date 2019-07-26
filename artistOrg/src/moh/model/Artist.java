package moh.model;

import java.util.ArrayList;
import java.util.List;

public class Artist {
private String bandName;
private String firstName;
private String lastName;
private  SacemReg artistSacem;
private List<Album>albumList= new ArrayList<Album>();
public Artist(String bandName, String firstName, String lastName, SacemReg artistSacem, List<Album> albumList) {
	super();
	this.bandName = bandName;
	this.firstName = firstName;
	this.lastName = lastName;
	this.artistSacem = artistSacem;
	this.albumList = albumList;
}
public Artist(String bandName, String firstName, String lastName) {
	super();
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
public SacemReg getArtistSacem() {
	return artistSacem;
}
public void setArtistSacem(SacemReg artistSacem) {
	this.artistSacem = artistSacem;
}
public List<Album> getalbumList() {
	return albumList;
}
public void setalbumList(List<Album> albumList) {
	this.albumList = albumList;
}
@Override
public String toString() {
	return "Artist [bandName=" + bandName + ", firstName=" + firstName + ", lastName=" + lastName + ", artistSacem="
			+ artistSacem + ", myAlbum=" + albumList + "]";
}

}
