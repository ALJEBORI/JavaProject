package elements;

public  class Dog extends Animal {

	public Dog(int mSpeed,String name, int x, int y, boolean inAir) {
		super(mSpeed,name, x, y, inAir);
		
	}

	@Override
	public String communicate() {
		// TODO Auto-generated method stub
		return "HHH";
	}
	
	

}
