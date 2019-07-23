package moh.designpattern;

public class Centralizer {
	private static Centralizer instance;
	private int printerIndexNumber = 0;
	private printer myPrinter[]= {new printer("Epson"),new printer("Canon")};

	private Centralizer() {
	}

	public static Centralizer getInstance() {
		if (instance == null)
			instance = new Centralizer();
		return instance;
	}

	public void print(String msg) {
		myPrinter[printerIndexNumber++].print(msg);
		if (printerIndexNumber == myPrinter.length) {
			printerIndexNumber = 0;
		}
	}

}
