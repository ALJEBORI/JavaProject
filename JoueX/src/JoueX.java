import java.util.Scanner;

public class JoueX {
	static void printArray(char arryP[][], int row, int column) {
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < column; j++)
				System.out.print(arryP[i][j] + " ");
			System.out.println("");
		}
	}

	public static void main(String[] args) {
		int ro = 0, col = 0, countRow =0, playerOne = 0, playerTwo = 0,tourCount=0;
		String myIp;
		Scanner Scanner = new Scanner(System.in);
		System.out.println("Bienvenue sur Puissance 4!");
		System.out.println(
				"Choisissez un nombre de lignes et de colonnes pour votre partie s'il vous plait (nombre de lignes-nombre de colonnes)");
		myIp = Scanner.next();
		ro = Integer.parseInt(myIp.split("-")[0]);
		col = Integer.parseInt(myIp.split("-")[1]);
		char jouArray[][] = new char[ro][col];

		for (int i = 0; i < ro; i++) {
			for (int j = 0; j < col; j++)
				jouArray[i][j] = '*';
		}
		System.out.println("Grille en cours :");
		printArray(jouArray, ro, col);
		countRow = ro - 1;
		while (countRow >= 0) {                               // MAIN LOOP
			System.out.println("Tour de joueur 1");
			System.out.println("Choisissez dans quelle colonne placer votre pion (entre 1 et  " + col + ")");
			playerOne = Scanner.nextInt();
			if (playerTwo == playerOne)
				countRow--;
			jouArray[countRow][playerOne] = 'x';
			printArray(jouArray, ro, col);
			System.out.println("Tour de joueur 2");
			System.out.println("Choisissez dans quelle colonne placer votre pion (entre 1 et  " + col + ")");
			playerTwo = Scanner.nextInt();
			if (playerTwo == playerOne)
				countRow--;
			jouArray[countRow][playerTwo] = 'o';
			printArray(jouArray, ro, col);

		}
		Scanner.close();
	}
}
