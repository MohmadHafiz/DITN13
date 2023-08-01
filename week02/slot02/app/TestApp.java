package week02.slot02.app;

import week02.slot02.assets.Pirate;

public class TestApp {
	
	public static void main(String[] args) {
		System.out.println(Pirate.totalPirates);
		
		Pirate pirate1 = new Pirate("Abu", 5);
		Pirate pirate2 = pirate1;
		Pirate pirate3 = new Pirate("Bakar", -10);
		
		System.out.println(pirate1.name);
		System.out.println(pirate2.name);
		System.out.println(pirate3.name);
		
//		pirate1.totalPirates += 1;
		pirate1.totalPirates = pirate1.totalPirates + 1;
		pirate3.totalPirates += 1;
		
		System.out.println(pirate2.totalPirates);
		
		System.out.println(Pirate.totalPirates);
		
	}

}
