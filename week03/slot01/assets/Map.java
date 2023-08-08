package week03.slot01.assets;

public class Map {

	private Pirate[][] arena;
	
	public Map(int width, int height) {
		if(width <= 0) {
			width = 5;
		}
		if(height <= 0) {
			height = 5;
		}
		arena = new Pirate[width][height];
	}
	
	public boolean checkCoordinate(int x, int y) {
		if(x >= 0 && x < getWidth() && y >= 0 && y < getHeight()) {			
			return true;
		}
		return false;
	}
	
	public void movePirate(int newX, int newY, int currentX, int currentY) {
		Pirate pirate = selectPirate(currentX, currentY);
		if(pirate != null) {
			Pirate newLocation = selectPirate(newX, newY);
			if(newLocation != null) {
				// Attack the other pirate
				pirate.attackOtherPirate(newLocation);
			} else {
				if(checkCoordinate(newX, newY)) {					
					// Move the pirate to the new location
					arena[newX][newY] = pirate;
					arena[currentX][currentY] = null;
				}
			}
		}
	}
	
	public void addPirate(int x, int y, Pirate newPirate) {
		if(checkCoordinate(x, y)) {			
			arena[x][y] = newPirate;
		}
	}
	
	public Pirate selectPirate(int x, int y) {
		if(checkCoordinate(x, y)) {	
			return arena[x][y];
		}
		return null;
	}
	
	public int getWidth() {
		return arena.length;
	}
	
	public int getHeight() {
		return arena[0].length;
	}
	
}
