package interfaceExample;

import java.util.ArrayList;
import java.util.List;

public class Human extends Being implements Adopter,Buyer {
	private List<Animal> mypets = new ArrayList<Animal>();
	private int money;
	private House myhouse;

	public Human(int maxSeed, Animal mypets, int money, House myhouse) {
		super(maxSeed);
		this.mypets.add(mypets);
		this.money = money;
		this.myhouse = getMyhouse();
	}
	
	public Human(int maxSeed, int money) {
		super(maxSeed);
		this.money = money;
	}



	public Human(int maxSeed) {
		super(maxSeed);
	}


	@Override
	public void buy(House h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sell(House h) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean adopt(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean revoke(Animal a) {
		// TODO Auto-generated method stub
		return false;
	}

	public List<Animal> getMypets() {
		return mypets;
	}

	public void setMypets(List<Animal> mypets) {
		this.mypets = mypets;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public House getMyhouse() {
		return myhouse;
	}

	public void setMyhouse(House myhouse) {
		this.myhouse = myhouse;
	}

}
