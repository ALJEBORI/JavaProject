import java.util.HashSet;
import java.util.Scanner;

public class ShoppingHash {

	public static void main(String[] args) {
		String[] shop = { " Auto Radio", "Vitres Electrique", "GPS", "Sieges Massant", "Sieges Chauffants",
				" Ailerons UltraDynamique" };
		HashSet<String> myBasket = new HashSet<String>();
		String ans = "";
		int x, count;
		Scanner Scanner = new Scanner(System.in);
		while (!ans.equalsIgnoreCase("q")) {
			System.out.println("Nombre d'options selectiones : " + myBasket.size());
			System.out.println("Que voulez vous faire?");
			System.out.println("Ajouter des options a votre fiat (C)");
			System.out.println("Consulter vos options (L)");
			System.out.println("Supprimer votre panier (s)");
			System.out.println("Modifier votre panier (m)");
			System.out.println("Quitter (Q)");
			ans = Scanner.next();
			switch (ans) {
			case "C":
				System.out.println("Que voulez-vous acheter");
				for (int i = 0; i <= shop.length - 1; i++) {
					System.out.println(i + " :" + shop[i]);
				}
				x = Scanner.nextInt();
				myBasket.add(shop[x]);
				break;
			case "L":
				count = 0;
				System.out.println("Voici le contenu de votre panier");
				for (String i : myBasket) {
					System.out.println(count + " :" + i);
					count++;
				}
				break;
			case "S":
				myBasket.clear();
				break;
			default:
			}

		}
		Scanner.close();
	}
}
