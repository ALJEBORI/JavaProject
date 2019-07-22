package com.moh.bankdomain;

import java.util.ArrayList;

public class Company {


	private String name;
	private ArrayList<Employee> empl=new ArrayList<Employee>();

	public Company(String name) {
		super();
		this.name = name;
	}
	
	public void add(Employee em) {
		this.empl.add(em);
	}
	public void removeById(int id) {
		this.empl.remove(id);
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", empl=" + empl + "]";
	}
	
	

}
