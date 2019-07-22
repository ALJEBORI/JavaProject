package com.moh;

public class DVD extends MEDIA {
   private  int nbChapter;

public DVD(int id, String title, int nbChapter) {
	super(id, title);
	this.nbChapter = nbChapter;
}

public int getNbChapter() {
	return nbChapter;
}

public void setNbChapter(int nbChapter) {
	this.nbChapter = nbChapter;
}
   
   
   

}
