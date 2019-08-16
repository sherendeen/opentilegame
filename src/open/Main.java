package open;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


/**
 * 
 * @author Seth G. R. Herendeen
 * @since 15 August, 2019
 * 
 */
public class Main extends Application {
	private SceneManagement sman;
	
	
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		sman = new SceneManagement();
		
//		var box = new VBox();
//		
//		Scene scene = new Scene(box, 768,768);
		primaryStage.setScene(sman.getMainMenuScene());
		primaryStage.show();
	}
	
	
}
