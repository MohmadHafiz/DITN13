package week03.slot01.assets;

public class Pirate {

	private final static int DEFAULT_HEALTH = 3;
	private final static String DEFAULT_NAME_PREFIX = "Pirate";
	private static int totalPirates = 1;
	private String name;
	private int health;
	int defence;
	
	public Pirate(String name, int health) {
		if(name == null || name.isEmpty()) {
			this.name = DEFAULT_NAME_PREFIX + totalPirates;
			totalPirates++;
		} else {			
			this.name = name;
		}
		if(health <= 0) {
			this.health = DEFAULT_HEALTH;
		} else {			
			this.health = health;
		}
	}
	
	public String toString() {
		return "[" + name + ", " + health + "]";
	}
	
}
