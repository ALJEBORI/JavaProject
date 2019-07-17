import java.util.ArrayList;
import java.util.Scanner;

public class Basket {

	public static void main(String[] args) {
		String[] shop = { "Tomate", "Salade", "Oignon", "Orange", "Banana" };
		ArrayList<String> myBasket = new ArrayList<String>();
		String ans = "";
		int x, z, d;
		Scanner Scanner = new Scanner(System.in);
		while (!ans.equalsIgnoreCase("q")) {
			System.out.println("Number of emlements in your Basket : " + myBasket.size());
			System.out.println("Que voulez vous faire?");
			System.out.println("Ajouter des elements au panier (c)");
			System.out.println("Consulter votre panier (l)");
			System.out.println("Supprimer votre panier (s)");
			System.out.println("Modifier votre panier (m)");
			System.out.println("Quitter (q)");
			ans = Scanner.next();
			switch (ans) {
			case "c":
				System.out.println("Que voulez-vous acheter");
				for (int i = 0; i <= shop.length - 1; i++) {
					System.out.println(i + " :" + shop[i]);
				}
				x = Scanner.nextInt();
				myBasket.add(shop[x]);
				break;
			case "l":
				System.out.println("Voici le contenu de votre panier");
				for (int i = 0; i <= myBasket.size() - 1; i++)
					System.out.println(i + " :" + myBasket.get(i));
				break;
			case "s":
				myBasket.clear();
				break;
			case "m":
				System.out.println("Entrez le nombr d'element vous voulez changer: ");
				z = Scanner.nextInt();
				System.out.println("Entrez le nombr d'element vous voulez ajouter: : ");
				d = Scanner.nextInt();
				myBasket.remove(z);
				myBasket.add(z, shop[d]);
				break;
			default:
			}

		}
		Scanner.close();

	}
}
