package com.xworkz.ipl;

import com.xworkz.ipl.dto.IplDTO;

public class IplTester {
 
	public static void main(String[] args) {
		
		IplDTO ipl=new IplDTO();
		ipl.setGameOf("Cricket");
		ipl.setType("Domestic");
		ipl.setSponser("TATA");
		ipl.setMangedBy("BCCI");
		ipl.setTeams(10);
		
	System.out.println(ipl.getGameOf()+" "+ipl.getType()+" "+ipl.getSponser()+" "+ipl.getMangedBy()+" "+ipl.getTeams());
	
	}
	
}
