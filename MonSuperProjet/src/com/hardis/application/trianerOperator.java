package com.hardis.application;

import java.util.Scanner;

public class trianerOperator {

	public static void main(String[] args) {
		/*
		 * int age = 20; boolean vegetrian = true; Scanner scanner = new
		 * Scanner(System.in); int a = scanner.nextInt(); if (vegetrian) {
		 * System.out.println("Salade"); } else { System.out.println("Vache"); } String
		 * state = (age < 18) ? "Minor" : "Major"; System.out.println("state = " +
		 * state);
		 */
		Scanner scanner = new Scanner(System.in);
		/*	for (int i=0;i<=2;i++) {
			System.out.println("Enter any integer Number");
			int a = scanner.nextInt();
			if ((a > 0)) {
				if (a % 2 == 0) {
					System.out.println("Le nombre  " + a + "  est positive et pair");
				} else {
					System.out.println("Le nombre  " + a + "  est positive et impair");
				}
			} else {
				if ((a < 0)) {
					if (a % 2 == 0) {
						System.out.println("Le nombre  " + a + "  est negatif et pair");
					} else {
						System.out.println("Le nombre  " + a + "  est negatif et impair");
					}

				}
				if (a == 0) {
					System.out.println("Le nombre est zèro (est il est pair)");
				}
			}
			/*
			 * for(int i=10; i>=0;i--) { System.out.println("i =  " + i); }
			 */
		System.out.println("Enter any two integer Number");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int res=0;
		System.out.println("Enter the required operation");
		String opr = scanner.next();
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
		System.out.println("Enter any  integer Number");
		int n = scanner.nextInt();
		boolean isPrime=false;
		    // Corner cases
		    if (n <= 1)  isPrime=false;
		    if (n <= 3)  isPrime=true;
		    if (n%2 == 0 || n%3 == 0) isPrime= false;
		    for (int i=5; i*i<=n; i=i+6)
		        if (n%i == 0 || n%(i+2) == 0)
		        	isPrime= false;
		        else isPrime= true;
		    if (isPrime)
		    	System.out.println("Number is Prime");
		    else
		    	System.out.println("Number is not Prime");
		     
	/*	int temp=a-b;
		if(temp<0) {
			temp=temp*-1;
		} 
		System.out.println("Result is  " + temp); */
		scanner.close();   
	}
	
}

