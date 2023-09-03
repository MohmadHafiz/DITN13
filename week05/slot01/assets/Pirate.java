package week05.slot01.assets;

import week05.slot01.assets.interfaces.Consumable;
import week05.slot01.assets.interfaces.Placeable;
import week05.slot01.assets.weapons.Weapon;

public class Pirate implements Placeable, Consumable {

	private final static int DEFAULT_HEALTH = 3;
	private final static String DEFAULT_NAME_PREFIX = "Pirate";
	private static int totalPirates = 1;  
	private String name;
	private int health; //public/private is a modifier
	private int defence;  //no modifier 
	private Weapon weapon; //instance variable 
	
	public Pirate(){
		this(null, DEFAULT_HEALTH);
	}

	public Pirate(String name, int health) {
		this.name = name;  //this.name refers to the 'name' on the instance variable (line 8)
			
			if (name == null || name.isEmpty()) {
				this.name = DEFAULT_NAME_PREFIX + totalPirates;
				totalPirates++;
			}else {
				this.name = name;
			}
			
			
			if(health <= 0) { //refers to health line 20
				this.health = DEFAULT_HEALTH;
			}else{
				this.health = health; //2 different health refers to either health from line 9 & line 20 depend on the color matching.	
			}
			
			
		}
	
		
	public Pirate (String name, int health, int defence) {
		this(name,health);
		if(defence < 0) {
			defence = 0;
		}
		this.defence = defence;
	}
		
	public void atkOthrPirate(Pirate otherPirate) {
		if(otherPirate != null) {
			if(weapon == null) {
				//if pirate not holding any weapon
				if(otherPirate.getDefence() <= 0) { //if pirate defence <=0, cannot attack
					otherPirate.health--;
				}
			} else {
				//if pirate holding any weapon
				int damage = weapon.doDamage(otherPirate);
				if (damage > 0) {
					int newHealth = otherPirate.health - damage;
					otherPirate.health = newHealth;
				}
			}
		}
	}
		
	
	public void equipWeapon(Weapon weapon) {
		if(weapon != null) {
			this.weapon = weapon;
		}
	}
		
	public void unEquipWeapon() {
		this.weapon = null;
	}
		
	public int getHealth() {
		return health;
	}
		
	public void setHealth(int health) {
		if(health <0 ) {
			health = 1;
		}
		this.health = health;
	}
		
	public int getDefence() {
		return defence;
	}
	
	public Weapon getWeapon() {
		return weapon;
	}

	public String toString() {
//		return "I am a pirate"; //if statement datatype is String(line 30), datatype should be String too (datatype should be the same)  
		return "[" + name + ", " + health + "H, " + defence + "D," + weapon + "]"; 
		//return to the "caller" (TestApp.java line 13 to line 15)
		}

	@Override
	public void consumedBy(week02.slot01.assets.Pirate pirate) {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'consumedBy'");
	}

	
}
