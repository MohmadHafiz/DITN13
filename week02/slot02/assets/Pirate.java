package week02.slot02.assets;

public class Pirate {

	public static int totalPirates = 0;
	public String name;
	int health;
	int defence;
	
	public Pirate(String name, int health) {
		this.name = name;
		if(health < 0) {
			this.health = 5;
		} else {			
			this.health = health;
		}
	}
	
}
