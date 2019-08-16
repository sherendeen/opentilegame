package open;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class SceneManagement {
	
	public Scene getMainMenuScene() {
		
		var lbl = setupMainMenuTitle();
		var btnPlay = setupButtonAs(new NewButton());
		var btnLoad = setupButtonAs(new LoadButton());
		var btnCredits = setupButtonAs(new AboutButton());
		var btnExit = setupButtonAs(new ExitButton());
		
		
		var box = new VBox();
		
		box.getChildren().addAll(lbl,btnPlay,btnLoad,btnCredits,btnExit);
		
		Scene menuScene = new Scene(box, 768, 768);
		
		
		return menuScene;
	}
	
	private Button setupButtonAs(PolymorphicButton btn) {
		var myButton = new Button(btn.getLabel());
		
		myButton.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent e) {
				btn.engage();
			}
		});
		
		return myButton;
	}
	
//	private Button setupLoadGameButton() {
//		var btn = new Button("New Game");
//		btn.setOnAction(new EventHandler<ActionEvent>() {
//
//			@Override
//			public void handle(ActionEvent e) {
//				System.out.println("New Game clicked");
//			}
//			
//		});
//		return btn;
//	}
	
	private Label setupMainMenuTitle() {
		var lbl = new Label("Open Tile!");
		return lbl;
	}
	
	public Scene getGameScene() {
		//var gameScene = new Scene();
		
		return null;
	}
	
	
}
