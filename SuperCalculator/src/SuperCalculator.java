import java.util.Scanner;
public class SuperCalculator {
	public static void main(String[] args) {
		String ans=" ",opr=" ";
		int x=0,z=0,a=0,b=0,res=0;
		System.out.println("Super Calculator 2000");
		System.out.println("##################################");
		Scanner Scanner = new Scanner(System.in);
		while(!ans.equalsIgnoreCase("q")) {
			System.out.println("Que vous tu faire?");
			System.out.println("- table: Table de Multiplication");
			System.out.println("- calc: Calculatrice");
			System.out.println("- q: Quitter");
			ans = Scanner.next();
			if (ans.equals("table")) {
				System.out.println("Donnes moi un chiffre:");
				x=Scanner.nextInt();
				for(int i=1;i<=10;i++) {
					z=i*x;
					System.out.println(i + "x" + x + "=" + z);
				}
				continue;
		   }
		   if (ans.equals("calc")) {
			   System.out.println("On calcule quoi?");
			   System.out.println("Nombre 1:");
			   a=Scanner.nextInt();
			   System.out.println("Operator :");
			   opr = Scanner.next();
			   System.out.println("Nombre 2:");
			   b=Scanner.nextInt();
				switch (opr) {
				case "+":
					res=a+b;
					System.out.println(a+ "  +  "+ b + "  =  "+res);
					break;
				case "-":
					res=a-b;
					System.out.println(a+ "  -  "+ b + "  =  "+res);
					break;
				case "*":
					res=a*b;
					System.out.println(a+ "  *  "+ b + "  =  "+res);
					break;
				case "/":
					res=a/b;
					System.out.println(a+ "  /  "+ b + "  =  "+res);
					break;
				default:
					System.out.println("Sorry you enter wrong operation");
					break;
				}
			   
			continue;
			}
			
		} // end while
		
    Scanner.close();
	} // end main

}
