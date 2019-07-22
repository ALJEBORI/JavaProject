package videogamemodalization;

public abstract class Humanoid {
	private int health;
	private int force;
	
public Humanoid(int health, int force) {
		super();
		this.health = health;
		this.force = force;
	}
public void attack(Humanoid h) {
	h.health-=this.force;
}
public void receiveDamage(int damage) {
	this.health-=damage;
}
public int getHealth() {
	return health;
}
public void setHealth(int health) {
	this.health = health;
}
public int getForce() {
	return force;
}
public void setForce(int force) {
	this.force = force;
}


}
