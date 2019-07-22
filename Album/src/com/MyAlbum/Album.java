package com.MyAlbum;

import java.util.ArrayList;

public class Album {

	private static int albumCount = 0;
	private int id=0;
	private String titre;
	private ArrayList<Piste> myPist = new ArrayList<Piste>();
	
	public Album(String titre, Piste myPist) {
		super();
		this.id = ++albumCount;
		this.titre = titre;
		this.myPist.add(myPist);
	}
	public void ajoutPist(Piste newPist) {
		this.myPist.add(newPist);
	}

	public void supprimPist(Piste newPist) {
		this.myPist .remove(newPist);

	}

	public void affichePist() {
		for(Piste i:myPist)
		System.out.println("Your Pist is " + i);
	}

	
	public static int getAlbumCount() {
		return albumCount;
	}

	public static void setAlbumCount(int albumCount) {
		Album.albumCount = albumCount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}


	@Override
	public String toString() {
		return "Album [id=" + id + ", titre=" + titre + ", myPist=" + myPist + "]";
	}
	public static void main(String[] args) {
        
		Piste pist1=new Piste("life", 4);
		Album myAlbum1 = new Album("NewLife", pist1);
		System.out.println(myAlbum1);
		Piste pist2=new Piste("power", 4);
		Album myAlbum2 = new Album("hourses", pist1);
		System.out.println(myAlbum1);
		Piste pist3=new Piste("Moon", 4);
		Album myAlbum3 = new Album("Red", pist3);
		System.out.println(myAlbum1);
		Piste pist4=new Piste("trees", 4);
		Album myAlbum4 = new Album("flower", pist3);
		System.out.println(myAlbum1);
		

	}

}
