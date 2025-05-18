package BuilderPattern;

public class ClientCode {

	public static void main(String[] args) {
		Computer computer = new Computer.BuilderClass().setCpu("Intel i7").setRAM("16GB").setStorage("512GB")
				.setHasGraphicCard(true).build();
		computer.specs();
	}
}
