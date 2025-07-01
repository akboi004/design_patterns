package TemplateMethodDesignPattern;

public class Coffee extends CaffeineBevarage {

	@Override
	void brew() {
		System.out.println("Dripping coffee through filter");
	}

	@Override
	void addCondiments() {
		System.out.println("Adding milk and sugar");
	}

}
