package week03.slot01.app;

import week03.slot01.assets.Map;
import week03.slot01.assets.Pirate;

public class TestApp {
	
	public static void main(String[] args) {		
		Map map = new Map(6, 6);
		Map anotherMap = new Map(10, 10);
		Pirate pirate1 = new Pirate("Abu", 6);
		Pirate pirate2 = new Pirate("Bakar", 4);
		
		map.addPirate(1, 2, pirate1);
		map.addPirate(5, 4, pirate2);
		
		printArena(map);
		
		System.out.println("***************");
		
		printArena(anotherMap);
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
