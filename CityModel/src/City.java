
public class City {
	private String name;
	private String country;
	private double population;
	private String categorie;
	boolean capital;

	public City(String name, String country, double population, boolean capital) {
		this.name = name;
		this.country = country;
		this.population = population;
		this.calcGategorie();
		this.capital = capital;
	}

	public String makeCopmpare(City otherCity) {
		if (this.population > otherCity.population) {
			return "My City is Bigger than Other City";
		} else if (this.population < otherCity.population)
			return "My City is Smaller than Other City";
		else
			return "My City is same population of Other City";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCountry() {
		return country;
	}

	@Override
	public String toString() {
		return "City [name=" + name + ", country=" + country + ", population=" + population + ", categorie=" + categorie
				+ ", capital=" + capital + "]";
	}

	private void calcGategorie() {
		this.categorie = this.population > 3000000 ? "Big" : "Small";

	}

	public void setCountry(String country) {
		this.country = country;
	}

	public double getPopulation() {
		return population;
	}

	public void setPopulation(double population) {
		this.population = population;
		this.calcGategorie();
	}

	public String getCategorie() {
		return categorie;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public static void main(String[] args) {
		City city1 = new City("Lyon", "France", 5000000, false);
		City city2 = new City("Paris", "France", 50000000, true);
		City city3 = new City("Marsille", "France", 3000000, false);
		City city4 = new City("Gronoble", "France", 500000, false);
		System.out.println(city1);
		System.out.println(city2);
		System.out.println(city3);
		System.out.println(city4);

	}
}
