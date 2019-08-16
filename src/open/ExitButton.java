package open;

import javafx.application.Platform;

public class ExitButton extends PolymorphicButton {
	public ExitButton() {
		this.btnLabel = "Exit game";
	}
	
	public ExitButton(String btnLabel) {
		this.btnLabel = btnLabel;
	}
	
	@Override
	public void engage() {
		Platform.exit();
	}
}
