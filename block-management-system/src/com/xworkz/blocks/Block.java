package com.xworkz.blocks;

public class Block {

	public Block() {
	System.out.println(this.getClass().getSimpleName()+"Object is created");
	}

	{
		System.out.println("block 3 executed");
	}

	{
		System.out.println("block 4 executed");
	}
}
