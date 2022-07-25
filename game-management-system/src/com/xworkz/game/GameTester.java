package com.xworkz.game;

import com.xworkz.game.dto.GameDTO;

public class GameTester {

	public static void main(String[] args) {
		
	GameDTO game=new GameDTO();
	game.setName("BGMI");
	game.setType("Online");
	game.setTotalPlayers(100);
	game.setOrigin("South Korea");
		
		System.out.println(game.getName()+"//"+game.getType()+"//"+game.getTotalPlayers()+"//"+game.getOrigin());
	}
}
