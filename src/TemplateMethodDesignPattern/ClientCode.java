package TemplateMethodDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		CaffeineBevarage tea = new Tea();
		tea.prepareReciepe();

		System.out.println("-------------");

		CaffeineBevarage coffee = new Coffee();
		coffee.prepareReciepe();
	}
}
