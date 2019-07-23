package interfaceExample;

public class Being extends SpecialElement implements Movable {
	protected int maxSeed=1;

	public Being(int maxSeed,String name, int i, int j, boolean b) {
		super(name,i,j,b);
		this.maxSeed = maxSeed;
	}
	public int getMaxSeed() {
		return maxSeed;
	}

	public void setMaxSeed(int maxSeed) {
		this.maxSeed = maxSeed;
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
