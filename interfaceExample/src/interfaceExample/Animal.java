package interfaceExample;
public abstract class Animal extends Being {
	public abstract String communicate();
	private Human pOwner;
	public Animal(int maxSeed, Human pOwner) {
		super(maxSeed);
		this.pOwner = getpOwner();
	}
	
	public Animal(int maxSeed) {
		super(maxSeed);
	}

	public Human getpOwner() {
		return pOwner;
	}
	public void setpOwner(Human pOwner) {
		this.pOwner = pOwner;
	}

}
