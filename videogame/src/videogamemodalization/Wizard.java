package videogamemodalization;

public  class Wizard extends Humanoid {
	private int mana;
	private int intelligence;
	private boolean shield;
	private int shieldAttack=0;
	
	public Wizard(int health, int force, int mana, int intelligence, boolean shield, int shieldAttack) {
		super(health, force);
		this.mana = mana;
		this.intelligence = intelligence;
		this.shield = shield;
		this.shieldAttack = shieldAttack;
	}

	

}
