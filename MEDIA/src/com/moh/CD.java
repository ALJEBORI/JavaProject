package com.moh;

public class CD extends MEDIA {
   private  int nbTracks;

public CD(int id, String title, int nbTracks) {
	super(id, title);
	this.nbTracks = nbTracks;
}

public int getNbTracks() {
	return nbTracks;
}

public void setNbTracks(int nbTracks) {
	this.nbTracks = nbTracks;
}
   
  
  
	
}
