package interfaceExample;

import java.awt.List;
import java.util.ArrayList;
public class Human extends Being implements Adopter,Buyer {
	private List<Animal> mypets = new ArrayList<Animal>();
	private int money;
	private House myhouse;

	public Human(int mSpeed,String name,int i,int j,Boolean b,Animal mypets, int money, House myhouse) {
		super(mSpeed,name, i, j, b);
		this.mypets.add(mypets);
		this.money = money;
		this.myhouse = myhouse;
	}
	
	public Human(int mSpeed,String name,int i,int j,Boolean b, int money) {
		super(mSpeed,name, i, j, b);
		this.money = money;
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

	@Override
	public String toString() {
		return "Human [mypets=" + mypets + ", money=" + money + ", myhouse=" + myhouse + "]";
	}

}
