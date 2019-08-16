package open;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;

public class NewButton extends PolymorphicButton {
	
	public NewButton() {
		this.btnLabel = "New Game";
	}
	
	public NewButton (String label) {
		this.btnLabel = label;
	}
	
	@Override
	public void engage() {
	//	GameManagement.currentWorld = new World();
		
		ArrayList<Player> players = new ArrayList<Player>();
		players.add(new Player("Testificate"));
		
		//GameManagement.currentWorld = new World(World.generateTilesRandomly(), players);
		GameManagement.currentWorld = new World(new Date(), World.generateTilesRandomly(), players);
		try {
			FileManagement.saveMap(GameManagement.currentWorld, "/home/seth/ape.json");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
