package elements;

import java.util.ArrayList;
import java.util.List;

public  class Human extends Being {

	private int money;
	private List<Animal> myAnimal = new ArrayList<Animal>();
	private House humanHouse;

	public Human(String name, int x, int y, boolean inAir) {
		super(name, x, y, inAir);
		// TODO Auto-generated constructor stub
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public List<Animal> getMyAnimal() {
		return myAnimal;
	}

	public void setMyAnimal(List<Animal> myAnimal) {
		this.myAnimal = myAnimal;
	}

	public House getHumanHouse() {
		return humanHouse;
	}

	public void setHumanHouse(House humanHouse) {
		this.humanHouse = humanHouse;
	}

}
