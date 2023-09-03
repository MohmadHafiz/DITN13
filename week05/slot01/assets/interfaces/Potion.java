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

	@Override
	public void consumedBy(week02.slot01.assets.Pirate pirate) {
		if(pirate != null) {
			int newHealth = pirate.getHealth() + heal;
			pirate.setHealth(newHealth);
		}
	}
}
