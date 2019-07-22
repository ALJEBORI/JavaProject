import java.util.Scanner;

public class Car {
	private String brand;
	private String color;
	private float gaz;
	private static float tankCapacity;
	private boolean started;

	public Car(String brand, String color) {
		this.brand = brand;
		this.color = color;
		this.gaz = 0f;
		this.started = false;
	}

	public float fillTank(float gaz) {
		float size = 0f;
		size = this.gaz + gaz;
		if ((Car.tankCapacity - this.gaz) == 0)
			return this.gaz;
		if (size > Car.tankCapacity) {
			this.gaz = Car.tankCapacity;
			return this.gaz;
		} else if (size < Car.tankCapacity) {
			this.gaz = gaz + this.gaz;
			return this.gaz;
		} else {
			this.gaz = gaz;
			return this.gaz;
		}

	}

	public boolean start() {
		if ((this.started) || (gaz == 0f))
			return false;
		else {
			this.gaz -= 0.5;
			return true;
		}
	}

	public boolean stop() {
		if (this.started)
			return true;
		else
			return false;
	}

	public boolean drive(int distance) {
		if (this.gaz < distance)
			return false;
		else {
			this.gaz -= distance;
			return true;
		}

	}

	@Override
	public String toString() {
		return "Car [brand=" + brand + ", color=" + color + ", gaz=" + gaz + ", tankCapacity=" + tankCapacity
				+ ", started=" + started + "]";
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public static float getTankCapacity() {
		return tankCapacity;
	}

	public static void setTankCapacity(float tankCapacity) {
		Car.tankCapacity = tankCapacity;
	}

	public boolean isStarted() {
		return started;
	}

	public void setStarted(boolean started) {
		this.started = started;
	}

	public void setGaz(float gaz) {
		this.gaz = gaz;
	}

	public float getGaz() {
		return gaz;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String ans = " ";
		boolean x;
		int dist, fuel;
		float rem;
		Scanner Scanner = new Scanner(System.in);
		Car mycar = new Car("Pigeot", "red", 50f);
		System.out.println(mycar);
		while (!ans.equalsIgnoreCase("q")) {
			System.out.println("Que vous tu faire?");
			System.out.println("d: Démarrer?");
			System.out.println("a: Arreter?");
			System.out.println("c: Conduire?");
			System.out.println("p: Faire le plein?");
			System.out.println("s: Sortir");
			ans = Scanner.next();
			switch (ans) {
			case "d":
				if (mycar.start())
					System.out.println("Vrroooom la pigeot démarre");
				else
					System.out.println("La voiture ne démare pas");
				break;
			case "a":
				if (mycar.stop())
					System.out.println("La voiture Arreter");
				else
					System.out.println("On peux pas Arreter la voiture");
				break;
			case "c":
				System.out.println("Entrez la distance SVP");
				dist = Scanner.nextInt();
				if (mycar.drive(dist)) {
					System.out.println("We will gooooo");
					System.out.println("Remaining fuel is " + mycar.getGaz());
				}

				else
					System.out.println("Insufficient Fuel");
				break;
			case "p":
				System.out.println("hhhhhhh" + mycar.getGaz());
				System.out.println("Entrez la montant de litre ");
				fuel = Scanner.nextInt();
				rem = mycar.fillTank(fuel);
				System.out.println("Vous avez mantenant " + rem);
				break;
			default:
			}

		}
	}

}
