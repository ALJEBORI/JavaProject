package moh.model;

public class Album {
	private int id;
	private String title;
	private int releaseYear;
	public Album(int id, String title, int releaseYear) {
		super();
		this.id = id;
		this.title = title;
		this.releaseYear = releaseYear;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
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
	@Override
	public String toString() {
		return "Album [id=" + id + ", title=" + title + ", releaseYear=" + releaseYear + "]";
	}
	
	

}
