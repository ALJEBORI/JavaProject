package elements;

public class MainHouse {

	public static void main(String[] args) {
		Eagle eg1 = new Eagle("EGEG", 50, 100, true);
		Chicken chi1 = new Chicken("chick1", 20, 30, false);
		Dog dg1 = new Dog("DD1", 30, 15, false);
		Tree tt1 = new Tree("Flower", 1, 2, false);
		Human hh1 = new Human("human1", 40, 20, false);
		House hous1 = new House("myhouse", 20, 10, false);
		MobileHome mbHome = new MobileHome("mb1", 2, 4, false);
	}

}
