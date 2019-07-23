package interfaceExample;

public class Chicken extends Animal implements Flying {

/*	public Chicken(int maxSeed, Human pOwner) {
		super(maxSeed, pOwner);
		// TODO Auto-generated constructor stub
	}*/

	public Chicken(int mSpeed,String name,int i,int j,boolean b) {
		super(mSpeed, name, i, j, b);
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
