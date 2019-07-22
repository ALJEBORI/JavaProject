package videogamemodalization;

public  class Orc extends Humanoid {
	private int rang;
	
public Orc(int health, int force, int rang) {
		super(health, force);
		this.rang = rang;
	}
public void useRange(Humanoid h) {
	
}
public void addRange(int rang) {
	
}
public int getRang() {
	return rang;
}
public void setRang(int rang) {
	this.rang = rang;
}

}
