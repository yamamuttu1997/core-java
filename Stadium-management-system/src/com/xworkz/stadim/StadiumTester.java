package com.xworkz.stadim;

import com.xworkz.stadim.dto.StadiumDTO;

public class StadiumTester {
	public static void main(String[] args) {
		
		StadiumDTO stadium=new StadiumDTO();
		stadium.setName("Chinnaswami");
		stadium.setLocation("Bengaluru");
		stadium.setEntryFees(2000);
		stadium.setMatch("CSK Vs RCB");
		stadium.setSeatNo(234);
		
		System.out.println(stadium.getName()+"// "+stadium.getLocation()+"// "+stadium.getEntryFees()+"// "+stadium.getMatch()+"// "+stadium.getSeatNo());
	}

}
