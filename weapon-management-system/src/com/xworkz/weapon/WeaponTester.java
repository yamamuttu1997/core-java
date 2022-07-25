package com.xworkz.weapon;

import com.xworkz.weapon.dto.WeaponDTO;

public class WeaponTester {

  public static void main(String[] args) {
	  
	  WeaponDTO wp= new WeaponDTO();
	  wp.setName("351 Magnum");
	  wp.setType("Gun");
	  wp.setRange(55);
	  wp.setOrigin("Germany");
	  
	  System.out.println(wp.getName()+" "+wp.getType()+" "+wp.getRange()+" "+wp.getOrigin()); 
  }
  
}
 