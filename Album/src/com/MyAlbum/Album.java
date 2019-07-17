package com.MyAlbum;

public class Album {
	String titre;
	int nbPist;

	public Album(String titre, int nbPist) {
		this.nbPist = nbPist > 24 ? 10 : nbPist;
		this.titre = titre;

	}

	public Album(int nbPist) {
		this.nbPist = nbPist;
	}
	public void ajoutPist(int nombre) {
		this.nbPist+=nombre;
	}
	public void supprimPist(int nombre) {
		this.nbPist-=nombre;
		
	}
	public void affichePist() {
		System.out.println("Your Pist is " + this.nbPist);
	}

	public static void main(String[] args) {

		Album myAlbum1 = new Album("FirstAlbum", 10);
		Album myAlbum2 = new Album("FirstAlbum", 50);

	}

}
