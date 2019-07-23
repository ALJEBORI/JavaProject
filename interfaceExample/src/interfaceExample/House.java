package interfaceExample;

import java.util.ArrayList;
import java.util.List;

public class House extends SpecialElement implements Comparable<House> {
	private List<Human> owner=new ArrayList<Human>();
	private Ematerial matOwner;
	private int price;
	public House(Human owner, Ematerial matOwner, int price) {
		super();
		this.owner.add(owner);
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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + price;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		House other = (House) obj;
		if (price != other.price)
			return false;
		return true;
	}

	@Override
	public int compareTo(House o) {
		// TODO Auto-generated method stub
		if(this.price>o.price)
		return +1;
		else if (this.price==o.price)
			return 0;
		return -1;
	}

	
	

}
