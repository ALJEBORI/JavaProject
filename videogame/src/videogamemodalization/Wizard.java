package videogamemodalization;

public  class Wizard extends Humanoid {
	private int mana;
	private int intelligence;
	private boolean shield;
	private int shieldAttack=0;

	
public Wizard(int health, int force, int rang) {
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
