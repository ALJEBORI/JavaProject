package com.moh.bankdomain;

public class Status {

	private boolean manager = false;
	private int year;

	public Status(int year) {
		super();
		this.year = year;
	}

	public Status(int year, boolean manager) {
		super();
		this.year = year;
		this.manager = manager;
	}

	public boolean isManager() {
		return manager;
	}

	public void setManager(boolean manager) {
		this.manager = manager;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
