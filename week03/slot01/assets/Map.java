package week03.slot01.assets;

public class Map {

	private Pirate[][] arena;
	
	public Map(int width, int height) {
		arena = new Pirate[width][height];
	}
	
	public void addPirate(int x, int y, Pirate newPirate) {
		arena[x][y] = newPirate;
	}
	
	public Pirate selectPirate(int x, int y) {
		return arena[x][y];
	}
	
	public int getWidth() {
		return arena.length;
	}
	
	public int getHeight() {
		return arena[0].length;
	}
	
}
