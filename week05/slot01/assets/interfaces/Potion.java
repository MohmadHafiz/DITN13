package week05.slot01.assets.interfaces;

public class Potion implements Placeable, Consumable { 

	int heal;
	
	public Potion (int heal) {
		if(heal <= 0) {
			heal = 1;
		}
		this.heal = heal;
	}
	
	public int getHeal() {
		return heal;
	}

	@Override
	public String toString() {
		return "Potion [heal=" + heal + "]";
	}
	
	
	
}
