package moh.designpattern;

import com.app.printer.model.Poste;

public class TestSingleTon {

	public static void main(String[] args) {
		Poste p1 = new Poste("Machine de la compta");
		Poste p2 = new Poste("Machine de l'usine");
		Poste p3 = new Poste("Machine de la cantine");
		
		p1.print("Salut gégé!!");
		p1.print("Salut gégé!!");
		p1.print("Salut gégé!!");
		p3.print("Salut francis!!");
		p3.print("Salut francis!!");
		p3.print("Salut francis!!");
		p3.print("Salut francis!!");
		p1.print("Salut gégé!!");
		p3.print("Salut francis!!");
		p1.print("Salut gégé!!");

	}

}
