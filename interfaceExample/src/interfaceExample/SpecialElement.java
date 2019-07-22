package interfaceExample;

public abstract class SpecialElement {
	private String name;
	protected int x;
	protected int y;
	protected boolean inAir;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public boolean isInAir() {
		return inAir;
	}
	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}

	
}
