package com.moh.bankdomain;

public class BankInfo {

	private int number;
	private String bankName;
	
	public BankInfo(int number, String bankName) {
		super();
		this.number = number;
		this.bankName = bankName;
	}

	@Override
	public String toString() {
		return "BankInfo [number=" + number + ", bankName=" + bankName + "]";
	}

	public static void main(String[] args) {

	}

}
