package week02.slot01.app;

import week02.slot01.assets.Pirate;

public class TestApp {
	
	public static void main(String[] args) {
		System.out.println(Pirate.totalPirates);
		
		Pirate pirate1 = new Pirate();
		Pirate pirate2 = pirate1;
		Pirate pirate3 = new Pirate();
		
		pirate1.name = "Abu";
		
		System.out.println(pirate1.name);
		System.out.println(pirate2.name);
		
		pirate2.name = "Bakar";
		
		System.out.println(pirate1.name);
		System.out.println(pirate2.name);
		
		pirate3.name = "Curi";
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
