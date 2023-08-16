package week04.slot02.assets.weapons;

import week04.slot02.assets.Pirate;

public class Axe extends Weapon {

	public Axe(int damage) {
		super(damage);
	}

	@Override
	public String toString() {
		return "Axe [damage=" + getDamage() + "]";
	}
	
	public int doDamage(Pirate pirate) {
		if(pirate != null) {
			return getDamage();
		}
		return -1;
	}
	
}
