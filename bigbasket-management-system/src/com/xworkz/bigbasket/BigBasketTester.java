package com.xworkz.bigbasket;

import com.xworkz.bigbasket.dto.BigBasketDTO;

public class BigBasketTester {

	public static void main(String[] args) {
		
		BigBasketDTO bb=new BigBasketDTO();
		bb.setOwnedBy("TATA DIGITAL METHOD");
		bb.setType("Online and Offline");
		bb.setStartedIn(2011);
		bb.setOrigin("Bengaluru");
		
		System.out.println(bb.getOwnedBy()+"//"+bb.getType()+"// "+bb.getStartedIn()+"// "+bb.getOrigin());
		
		
		
		
		
	}

}
