package com.xworkz.atmapp;

import java.util.Scanner;

public class AtmTester {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the amount");
		int limit = sc.nextInt();
		Machine machine =new Machine();
		try {
			machine.withdraw(limit);
		} catch (AtmException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("main method ended");
		sc.close();
	}
}
