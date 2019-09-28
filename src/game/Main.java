package game;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application {
	
	public static void main(String[] args) {
		
		launch(args);
		
	}

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		var lbl = new Label("Hello World!");
		
		var box = new HBox();
		
		box.getChildren().add(lbl);
		
		Scene scene = new Scene(box);
		primaryStage.setScene(scene);
		primaryStage.show();
	}
	
	
	
}
