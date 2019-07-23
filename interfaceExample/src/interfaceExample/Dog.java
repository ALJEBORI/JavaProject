package interfaceExample;

public class Dog extends Animal {

	public Dog(int maxSeed,String name, int i, int j, boolean b, Human pOwner) {
		super(maxSeed,name,i,j,b,pOwner);
		
	}

	public Dog(int maxSpeed,String name, int i, int j, boolean b) {
		super(maxSpeed,name,i,j,b);
		// TODO Auto-generated constructor stub
	}



	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return null;
	}

}
