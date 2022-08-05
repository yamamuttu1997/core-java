package com.xworkz.pubapp;

public class Bouncer {
   public void check(int age) throws PubException {
	   System.out.println("check method started");
	   if(age>=18) {
		   System.out.println("please enter.....Enjoyyy");
		 
	   }
	   else {
		  // PubException exception = new PubException();
		   throw  new PubException();
	   }
	   System.out.println("Check method ended");
   }
}
