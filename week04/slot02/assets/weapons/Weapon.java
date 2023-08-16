package week04.slot02.assets.weapons;

import week04.slot02.assets.Pirate;

public class Weapon {
	
	private int damage;
	
	public Weapon(int damage) {
		setDamage(damage);
	}
	
	public int doDamage(Pirate pirate) {
		if(pirate != null) {
			// weapon damage - pirate defence
			int newDamage = getDamage() - pirate.getDefence();
			return newDamage;
		}
		return -1;
	}
	
	public void setDamage(int damage) {
		if(damage < 1) {
			damage = 1;
		}
		this.damage = damage;
	}
	
	public int getDamage() {
		return damage;
	}

	@Override
	public String toString() {
		return "Weapon [damage=" + damage + "]";
	}

}
