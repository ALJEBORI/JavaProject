package elements;

public abstract class Being extends SpecialElement {

	protected int maxSpeed=1;
	
	public Being(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}

	public int getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(int maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

}
