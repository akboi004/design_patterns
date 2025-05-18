package AbstractFactoryPattern;

public class ApplicationCode {

	private Button button;
	private CheckBox checkBox;

	public ApplicationCode(GUIFactory factory) {
		this.button = factory.createButton();
		this.checkBox = factory.createCheckBox();
	}

	public void renderUI() {
		button.paint();
		checkBox.check();
	}
}
