package com.moh;

public class Book extends MEDIA {
   private  String isbn;

public Book(int id, String title, String isbn) {
	super(id, title);
	this.isbn = isbn;
}

public String getIsbn() {
	return isbn;
}

public void setIsbn(String isbn) {
	this.isbn = isbn;
}
    

}
