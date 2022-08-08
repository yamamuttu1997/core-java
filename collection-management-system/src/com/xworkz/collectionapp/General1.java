package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.Collection;

public class General1 {
	public static void main(String[] args) {
		Collection coll = new ArrayList();
		coll.add("Basu");
		coll.add("Manoj");
		coll.add("Drushya");
		coll.add("Darshan");
		coll.add("GuruDeep");
		coll.add("SunilBabu");
		coll.add("Suhas");
		coll.add("praveen");
		coll.add("Vaishnavi");
		coll.add("Shilpa");
		coll.add("Yama");
		
		coll.remove("Yama");
		coll.forEach(System.out::println);
	}
	

}
