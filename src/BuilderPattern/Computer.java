package BuilderPattern;

public class Computer {

	private String CPU;
	private String RAM;
	private String storage;
	private boolean hasGraphicCard;

	Computer(BuilderClass builder) {
		this.CPU = builder.CPU;
		this.RAM = builder.RAM;
		this.storage = builder.storage;
		this.hasGraphicCard = builder.hasGraphicCard;
	}

	public void specs() {
		System.out.println("CPU: " + CPU);
		System.out.println("RAM: " + RAM);
		System.out.println("Storage: " + storage);
		System.out.println("Graphics Card: " + (hasGraphicCard ? "Yes" : "No"));
	}

	static class BuilderClass {
		private String CPU;
		private String RAM;
		private String storage;
		private boolean hasGraphicCard;

		public BuilderClass setCpu(String CPU) {
			this.CPU = CPU;
			return this;
		}

		public BuilderClass setRAM(String RAM) {
			this.RAM = RAM;
			return this;
		}

		public BuilderClass setStorage(String storage) {
			this.storage = storage;
			return this;
		}

		public BuilderClass setHasGraphicCard(boolean hasGraphicCard) {
			this.hasGraphicCard = hasGraphicCard;
			return this;
		}

		public Computer build() {
			return new Computer(this);
		}

	}
}
