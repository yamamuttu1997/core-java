package com.xworkz.blocks;

public class BlockTester {

	public BlockTester() {
		System.out.println("object created");
	}
	
	int blockInit;
	{
		System.out.println("block is executed");
		blockInit=10;
	}
	static int blockInit1;
	static
	{
		System.out.println("block 1 is executed");
		 blockInit1=18;
	}

	public static void main(String[] args) {
		System.out.println("Main method started");
		BlockTester blockTester =new BlockTester();
		System.out.println(blockTester.blockInit);
		System.out.println(BlockTester.blockInit1);
		System.out.println("MainMethod endeds");
	}
}
