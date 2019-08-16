package open;

public class PolymorphicButton {
	protected String btnLabel = "Unnamed Button";
	
	public PolymorphicButton() {}
	
	public PolymorphicButton(String btnLabel) {
		this.btnLabel = btnLabel;
	}
	
	public void engage() {
		System.out.println("Engaged");
	}

	public String getLabel() {
		return this.btnLabel;
	}
	
	
}
