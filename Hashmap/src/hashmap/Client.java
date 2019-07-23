package hashmap;

public class Client {
private String nom;
private int nbSalarie;
private EPole pole;
public Client(String nom, int nbSalarie, EPole pole) {
	super();
	this.nom = nom;
	this.nbSalarie = nbSalarie;
	this.pole = pole;
}
public String getNom() {
	return nom;
}
public void setNom(String nom) {
	this.nom = nom;
}
public int getNbSalarie() {
	return nbSalarie;
}
public void setNbSalarie(int nbSalarie) {
	this.nbSalarie = nbSalarie;
}
public EPole getPole() {
	return pole;
}
public void setPole(EPole pole) {
	this.pole = pole;
}

	
}
