package elements;

public abstract class Animal extends Being {

	private Human owner;

	public abstract String communicate();

	public Animal(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}

	public Human getOwner() {
		return owner;
	}

	public void setOwner(Human owner) {
		this.owner = owner;
	}

}
