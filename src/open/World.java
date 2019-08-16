package open;

import java.util.ArrayList;
import java.util.Date;

public class World {

	private Date dateCreated;
	private Tile[][] tiles;
	private ArrayList<Player> players;
	
	public World() {}
	
	public World(World world) {
		this.tiles = world.getTiles();
		this.dateCreated=world.getDateCreated();
		this.players = world.getPlayers();
	}
	
	/**
	 * Creates a new world
	 * @param dateCreated the date on which the world was created
	 * @param tiles the tiles representing the world
	 * @param players the initial players. Players could potentially be added
	 */
	public World(Date dateCreated, Tile[][] tiles, ArrayList<Player> players) {
		this.dateCreated = dateCreated;
		this.tiles = tiles;
		this.players = players;
	}
	
	/**
	 * Only call if needed...
	 */
	public void createDate() {
		this.dateCreated= new Date();
	}
	
	/**
	 * Creates a new world.
	 * dateCreated is automatically self-initialized
	 * @param tiles the tiles representing the world
	 * @param players the initial players. Players could potentially be added
	 */
	public World(Tile[][] tiles, ArrayList<Player> players) {
		this.tiles = tiles;
		this.players = players;
		
		this.dateCreated = new Date();
	}
	
	public ArrayList<Player> getPlayers() {
		return this.players;
	}
	
	
	public void setTiles(Tile[][] tiles) {
		this.tiles = tiles;
	}
	
	public Tile[][] getTiles() {
		return this.tiles;
	}
	
	public Date getDateCreated() {
		return this.dateCreated;
	}
	
	/**
	 * 
	 */
	@Override
	public String toString() {
		return "Date created: " + 
	this.dateCreated + "\nNumber of Players: "
	+players.size() + "\nNumber of Tiles:" 
				+ this.tiles.length;
	}
	
	/**
	 * Helper method designed to generate the world
	 * with tiles and features
	 * @return a randomly generated tileset
	 */
	public static Tile[][] generateTilesRandomly() {
		Tile[][] tiles = new Tile[10][10];
		
		for(int i = 0; i < tiles.length; i++){
			for (int j = 0; j < tiles[i].length; j++) {

				//instantiate the individual tile obj
				tiles[i][j] = new Tile();
				// set the tiletype
				tiles[i][j].setRandomTileType();
				// set the tile feature
				tiles[i][j].setRandomTileFeature();
			}
		}
		
		return tiles;
	}
	
	/**
	 * Helper method designed to generate the world
	 * with tiles and features
	 * @param width the WIDTH of the world in tiles
	 * @param height the HEIGHT of the world in tiles
	 * @return an otherwise completely random tileset
	 */
	public static Tile[][] generateTilesRandomly(int width, int height) {
		Tile[][] tiles = new Tile[width][height];
		
		for(int i = 0; i < tiles.length; i++){
			for (int j = 0; j < tiles[i].length; j++) {
				tiles[i][j].setRandomTileFeature();
				tiles[i][j].setRandomTileType();
			}
		}
		
		return tiles;
	}
	
}
