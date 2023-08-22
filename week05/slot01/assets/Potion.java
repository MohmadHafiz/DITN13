package week05.slot01.assets;

import week05.slot01.assets.interfaces.Placeable;

public class Potion implements Placeable {

	int heal;
	
	public Potion(int heal) {
		if(heal <= 0) {
			heal = 1;
		}
		this.heal = heal;
	}
	
	public int getHeal() {
		return heal;
	}
	
	public String toString() {
		return "Potion [heal=" + heal + "]";
	}
	
}
