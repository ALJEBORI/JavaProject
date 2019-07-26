package moh.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import moh.model.Club;
import moh.model.Customer;

public class TestDB {

	public static void main(String[] args) {
		List<Customer> custAll = new ArrayList<Customer>();
		ProductDaoImpl myp = new ProductDaoImpl();

		custAll = myp.findAll();
		System.out.println(custAll.size());



		
		System.out.println(myp.findByKey(5));
		System.out.println(myp.findByName("ALJEBORI"));
	//	Customer newCust = new Customer(3, "hoho", "toto");
		//myp.insert(newCust);
		//Customer upCust = new Customer(3, "Zig", "Zag");
		myp.deleteByKey(5);
		
		
		custAll = myp.findAll();
		System.out.println(custAll.size());
		for (Customer customer : custAll) {
			System.out.println("First Name: " + customer.getFirstName() + "  Last Name: " + customer.getLastName());
		}

	}

}
