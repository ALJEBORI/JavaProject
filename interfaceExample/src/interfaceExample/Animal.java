package interfaceExample;
public abstract class Animal extends Being {
	public abstract String communicate();
	private Human pOwner;
	
	public Animal(int mspeed,String name, int i, int j, boolean b) {
		super(mspeed,name,i,j,b);
	}

	public Animal(int maxSeed, String name, int i, int j,Boolean b, Human pOwner2) {
		super(maxSeed,name,i,j,b);
		this.pOwner = getpOwner();
	}

	public Human getpOwner() {
		return pOwner;
	}
	public void setpOwner(Human pOwner) {
		this.pOwner = pOwner;
	}

}
