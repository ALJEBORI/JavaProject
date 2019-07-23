package hashmap;

public class Commercial {
private String nom;
private String prenom;
private int secu;
public Commercial(String nom, String prenom, int secu) {
	super();
	this.nom = nom;
	this.prenom = prenom;
	this.secu = secu;
}
@Override
public String toString() {
	return "Commercial [nom=" + nom + ", prenom=" + prenom + ", secu=" + secu + "]";
}

}
