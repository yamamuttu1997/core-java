package com.xworkz.pubapp;

import java.util.Scanner;

public class PubTester {
	public static void main(String[] args) {
		System.out.println("Main method Started");
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the age");
		int age = sc.nextInt();
		Bouncer bouncer =new Bouncer();
		try {
			bouncer.check(age);
		} catch (PubException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
