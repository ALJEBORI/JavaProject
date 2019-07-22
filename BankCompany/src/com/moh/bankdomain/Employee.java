package com.moh.bankdomain;

public class Employee {
	private static int count = 0;
	private int id = 0;
	private String firstName;
	private String lastName;
	private int salary;
	private Status empStatus;
	private BankInfo empBankInfo;

	public Employee(String firstName, String lastName, int salary, Status empStatus, BankInfo empBankInfo) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
		this.empStatus = empStatus;
		this.empBankInfo = empBankInfo;
	}

	public static int getCount() {
		return count;
	}

	public static void setCount(int count) {
		Employee.count = count;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

}
