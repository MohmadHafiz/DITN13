package week04.slot02.assets.weapons;

import week04.slot02.assets.Pirate;

public class Drumstick extends Weapon {

	public Drumstick(int damage) {
		super(damage);
	}
	
	public String toString() {
		return "Drumstick [damage=" + getDamage() + "]";
	}
	
	public int doDamage(Pirate pirate) {
		if(pirate != null && pirate.getDefence() > 0) {
			return getDamage() * 2;
		}
		return -1;
	}
	
}
