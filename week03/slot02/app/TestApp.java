package week03.slot02.app;

import week03.slot02.assets.Map;
import week03.slot02.assets.Pirate;

public class TestApp {
	
	public static void main(String[] args) {		
		Map map = new Map(6, 6);
		Pirate pirate1 = new Pirate("Abu", 6);
		Pirate pirate2 = new Pirate("Bakar", 4);
		Pirate pirate3 = new Pirate();
		
		map.addPirate(1, 2, pirate1);
		map.addPirate(5, 4, pirate2);
		map.addPirate(2, 4, pirate3);
//		map.addPirate(-10, 10, new Pirate("Curi", 5));
//		map.selectPirate(10, 4);
		
		printArena(map);
		
		System.out.println("**************");
		
		map.movePirate(4, 1, 1, 2);
		
		printArena(map);
		
		System.out.println("**************");
		
		map.movePirate(5, 4, 4, 1);
		
		printArena(map);
		
		System.out.println("**************");
		
		map.movePirate(4, 1, Map.DIRECTION_DOWN);
		
		printArena(map);
	}
	
	public static void printArena(Map map) {
		for(int y = 0; y < map.getHeight(); y++) {
			for(int x = 0; x < map.getWidth(); x++) {
				System.out.print(map.selectPirate(x, y) + "\t");
			}
			System.out.println();
		}
	}

}
