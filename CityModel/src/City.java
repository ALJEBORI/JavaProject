
public class City {
	String name;
	String country;
	double population;
	String categorie;
	boolean capital;

	public City(String name, String country, double population, boolean capital) {
		this.name = name;
		this.country = country;
		this.population = population;
		this.categorie = this.population > 3000000 ? "Big" : "Small";
		this.capital = capital;
	}

	public String makeCopmpare(City otherCity) {
		if (this.population > otherCity.population) {
			return "My City is Bigger than Other City";
		} else {
			if (this.population < otherCity.population)
				return "My City is Smaller than Other City";
			else
				return "My City is same population of Other City";
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
