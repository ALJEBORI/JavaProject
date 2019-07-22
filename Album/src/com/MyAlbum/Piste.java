package com.MyAlbum;

public class Piste {
	String nom;
	int duree;

	public Piste(String titre, int nbPist) {
		this.duree = nbPist > 24 ? 10 : nbPist;
		this.nom = titre;

	}

	public void ajoutPist(int nombre) {
		this.duree+=nombre;
	}
	public void supprimPist(int nombre) {
		this.duree-=nombre;
		
	}
	public void affichePist() {
		System.out.println("Your Pist is " + this.duree);
	}

	@Override
	public String toString() {
		return "Album [id=" + " nom=" + nom + ", duree=" + duree + "]";
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String titre) {
		this.nom = titre;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int nbPist) {
		this.duree = nbPist;
	}

}
