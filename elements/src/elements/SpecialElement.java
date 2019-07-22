package elements;

public abstract class SpecialElement {
	private String name;
	protected int x, y;
	protected boolean inAir;

	public SpecialElement(String name, int x, int y, boolean inAir) {
		this.name = name;
		this.x = x;
		this.y = y;
		this.inAir = inAir;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isInAir() {
		return inAir;
	}

	public void setInAir(boolean inAir) {
		this.inAir = inAir;
	}

}
