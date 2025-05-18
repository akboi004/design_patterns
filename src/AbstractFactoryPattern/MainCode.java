package AbstractFactoryPattern;

public class MainCode {

	public static void main(String[] args) {
		GUIFactory factory;

		String os = System.getProperty("os.name").toLowerCase();

		if (os.contains("mac")) {
			factory = new MacFactory();
		} else {
			factory = new WindowsFactory();
		}

		ApplicationCode app = new ApplicationCode(factory);
		app.renderUI();
	}
}
