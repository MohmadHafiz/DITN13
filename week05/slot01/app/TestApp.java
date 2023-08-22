package week05.slot01.app;

import week05.slot01.assets.Map;
import week05.slot01.assets.Pirate;
import week05.slot01.assets.Potion;
import week05.slot01.assets.weapons.Axe;
import week05.slot01.assets.weapons.Gun;

public class TestApp {
	
	public static void main(String[] args) {		
		Map map = new Map(5, 4);
		Pirate pirate1 = new Pirate("Abu", 6, 2);
		Pirate pirate2 = new Pirate("Bakar", 4);
		Pirate pirate3 = new Pirate();
		Gun weapon1 = new Gun(2, 1);
		Axe weapon2 = new Axe(3);
		
		map.addPirate(2, 1, pirate1);
		map.addPirate(3, 0, pirate2);
		map.addPirate(4, 1, pirate3);
		map.addAsset(1, 2, weapon1);
		map.addAsset(3, 2, weapon2);
		map.addAsset(1, 0, new Potion(5));
		printArena(map);
		
		map.movePirateLeft(2, 1);
		printArena(map);
		
		map.movePirateDown(1, 1);
		printArena(map);
		
		map.movePirate(3, 0, 1, 2);
		printArena(map);
		
		map.movePirateRight(1, 2);
		map.movePirateRight(2, 2);
		printArena(map);
		
		map.movePirate(4, 1, 3, 2);
		printArena(map);
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.getHeight(); y++) {
			for(int x = 0; x < map.getWidth(); x++) {
				System.out.print(map.selectAsset(x, y) + "\t");
			}
			System.out.println();
		}
		System.out.println("***********************************");
	}

}
