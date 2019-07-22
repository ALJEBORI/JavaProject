package com.moh;
import java.util.ArrayList;

public abstract class MEDIA {
	private int id;
	private String title;
	private boolean available;

	public MEDIA(int id, String title) {
		this.id = id;
		this.title = title;
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		this.available = available;
	}

	public static void main(String[] args) {
		DVD myDvd = new DVD(1,"AAA",10);
		CD myCd = new CD(1,"CDCDC",5);
		Book myBook = new Book(1,"JAVA","455446hfhfh");
        myBook.setIsbn("125345kdfdlkdlk");
        myCd.setNbTracks(20);
        myDvd.setNbChapter(10);
        System.out.println(myDvd.getNbChapter());
        java.util.List<MEDIA> myMedia = new ArrayList<MEDIA>();
        
        
	}

}
