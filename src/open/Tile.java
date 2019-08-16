package open;

import java.text.Format;

public class Tile {
	
	private String description;
	private TileType tileType;
	private TileFeature tileFeature;
	
	public Tile() {}
	
	public Tile(String description) {
		this.setDescription(description);
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public void setRandomTileType() {
		int result = (int)(Math.random() * 12) ;//+ 1;
		this.tileType=TileType.values()[result];
	}
	
	public void setRandomTileFeature() {
		int result = (int)(Math.random() * 4) ;//+ 1;
		this.tileFeature = TileFeature.values()[result];
	}
	
	@Override
	public String toString() {
		return String.format("Desc: %s;\nTerrain: %s;\nFeature: %s;", 
				this.description,
				this.tileType.toString(),
				this.tileFeature.toString());
	}
	
	
}
