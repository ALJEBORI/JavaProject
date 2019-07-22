package interfaceExample;

public class Eagle extends Animal implements Flying {

	public Eagle(int maxSeed, Human pOwner) {
		super(maxSeed, pOwner);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean takeoff() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean land() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return null;
	}

}
