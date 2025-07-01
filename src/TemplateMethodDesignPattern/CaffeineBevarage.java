package TemplateMethodDesignPattern;

public abstract class CaffeineBevarage {

	final void prepareReciepe() {
		boilWater();
		brew();
		pourInCup();
		addCondiments();
	}

	void boilWater() {
		System.out.println("Boiling water");
	}

	void pourInCup() {
		System.out.println("Pouring into cup");
	}

	abstract void brew();

	abstract void addCondiments();

}
