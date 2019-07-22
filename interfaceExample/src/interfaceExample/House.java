package interfaceExample;

import java.util.ArrayList;
import java.util.List;

public class House extends SpecialElement {
	private List<Human> owner=new ArrayList<Human>();
	private Ematerial matOwner;
	private int price;
	public House(List<Human> owner, Ematerial matOwner, int price) {
		super();
		this.owner = owner;
		this.matOwner = matOwner;
		this.price = price;
	}
	
	public House(int price) {
		super();
		this.price = price;
	}

	public List<Human> getOwner() {
		return owner;
	}
	public void setOwner(List<Human> owner) {
		this.owner = owner;
	}
	public Ematerial getMatOwner() {
		return matOwner;
	}
	public void setMatOwner(Ematerial matOwner) {
		this.matOwner = matOwner;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

}
