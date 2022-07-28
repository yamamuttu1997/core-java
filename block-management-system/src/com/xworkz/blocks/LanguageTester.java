package com.xworkz.blocks;

import com.xworkz.blocks.dto.LanguageDTO;

public class LanguageTester {
	public static void main(String[] args) {

		LanguageDTO dto = new LanguageDTO();
		dto.setId(123);
		dto.setContactNo(8088746602L);
		dto.setName("Java");
		dto.setPrice(5.00);
		dto.setLNo('7');
		dto.setRate(12.7858558585f);

		//boxing
		Integer id = dto.getId();
		
		//un-boxing
		int id1= id.intValue();
		
		Long contactNo =dto.getContactNo();
		long contactNo1 = contactNo.longValue();
		
		Double price = dto.getPrice();
		double price1 = price.doubleValue();
		
		Character lNo=dto.getLNo();
		char lNo1  = lNo.charValue();
		
		Float rate =dto.getRate();
		float rate1 =rate.floatValue();
		System.out.println(dto);
	}
}
