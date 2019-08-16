package open;

import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.ButtonType;

public class AboutButton extends PolymorphicButton {
	
	public AboutButton() { 
		this.btnLabel="About...";
	}
	
	public AboutButton(String btnLabel) {
		this.btnLabel = btnLabel;
	}
	
	@Override
	public void engage() {
		Alert alert = new Alert(AlertType.INFORMATION);
		alert.setTitle("About...");
		alert.setHeaderText("Open Tile - About");
		alert.setContentText("Open Tile - Created by Seth G. R. Herendeen; Version 1.0"
				+ "\nAll code is licensed GNU GPL v3\n"
				+ "Except for the Gson component, which is Apache License 2.0.");
		
		
		
		
		alert.showAndWait().ifPresent( rs -> {
			if (rs == ButtonType.OK) {
				//puke
			}
		});
	}
}
