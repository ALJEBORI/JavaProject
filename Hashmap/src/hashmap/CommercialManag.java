package hashmap;

import java.nio.channels.FileChannel.MapMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class CommercialManag {

	public static void main(String[] args) {
		ArrayList<Client> clientListOne = new ArrayList<Client>();
		ArrayList<Client> clientListTwo = new ArrayList<Client>();
		Commercial commOne = new Commercial("Moh", "ALJEBORI", 99);
		Commercial commTwo = new Commercial("GG", "SSSS", 88);
		HashMap<Commercial, ArrayList<Client>> myDic = new HashMap<>();
		Client clientOne = new Client("Moh", 40, EPole.Auto);
		Client clientTwo = new Client("AAAA", 50, EPole.Banque);
		Client clientThree = new Client("BBBB", 20, EPole.Assurance);
		Client clientFour = new Client("CCCC", 10, EPole.Auto);
		Client clientFive = new Client("DDDD", 15, EPole.Banque);
		Client clientSix = new Client("EEEE", 25, EPole.Assurance);
		Client clientSeven = new Client("FFFF", 35, EPole.Auto);
		clientListOne.add(clientOne);
		clientListOne.add(clientTwo);
		clientListOne.add(clientThree);
		clientListTwo.add(clientFour);
		clientListTwo.add(clientFive);
		clientListTwo.add(clientSix);
		clientListTwo.add(clientSeven);
		myDic.put(commOne, clientListOne);
		myDic.put(commTwo, clientListTwo);
		for (Map.Entry<Commercial, ArrayList<Client>> c : myDic.entrySet()) {
			System.out.println("The Key is  \n" + c.getKey() + "\n The value is \n" + c.getValue()+"\n");
			for (Client v : c.getValue()) {
				System.out.println("Client Name:   "+ v.getNom() + "  Client nbSalarie:  " + v.getNbSalarie() + "   Client Pole:  "
						+ v.getPole()+"\n");
				System.out.println("Client Data  " + v.toString());
			}
		}

	}

}
