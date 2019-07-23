package moh.designpattern;

public class Poste {
	private String nom;

	public Poste(String nom) {
		this.nom = nom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	public void print(String msg) {
		Centralizer.getInstance().print(msg);
		
	}
	

}
