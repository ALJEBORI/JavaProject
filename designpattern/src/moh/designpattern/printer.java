package moh.designpattern;

public class printer {
	private String nom;
	public printer(String nom) {
		this.nom = nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getNom() {
		return nom;
	}
	public void print (String msg) {
		System.out.println("Printing of"+msg+"on"+this.nom);
	}

}
