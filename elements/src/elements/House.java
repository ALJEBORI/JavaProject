package elements;

import java.util.ArrayList;
import java.util.List;

public  class House extends SpecialElement {
	private int price;
	private List<Human> inhouse = new ArrayList<Human>();

	public House(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public List<Human> getInhouse() {
		return inhouse;
	}

	public void setInhouse(List<Human> inhouse) {
		this.inhouse = inhouse;
	}

}
