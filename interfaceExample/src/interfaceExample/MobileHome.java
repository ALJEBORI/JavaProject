package interfaceExample;

import java.util.List;

public class MobileHome extends House implements Movable {
	

	public MobileHome(List<Human> owner, Ematerial matOwner, int price) {
		super(owner, matOwner, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public boolean goUp(int speed) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean goDown(int speed) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean goRight(int speed) {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean goLeft(int speed) {
		// TODO Auto-generated method stub
		return true;
	}

}
