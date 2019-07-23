package elements;

public abstract class Animal extends Being {

	private Human owner;

	public abstract String communicate();

	public Animal(int mSpeed,String name, int x, int y, boolean inAir) {
		super(mSpeed,name, x, y, inAir);
	}
	public Animal(int mSpeed,String name, int x, int y, boolean inAir, Human owner) {
		super(mSpeed,name, x, y, inAir);
		this.owner=owner;
	}
	

	public Human getOwner() {
		return owner;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}

}
