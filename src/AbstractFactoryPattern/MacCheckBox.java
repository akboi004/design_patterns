package AbstractFactoryPattern;

public class MacCheckBox implements CheckBox {

	@Override
	public void check() {
		System.out.println("MacCheckBox is created...");
	}

}
