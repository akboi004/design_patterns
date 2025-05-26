package DecoratorDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		Coffee coffee = new SimpleCoffee();
		coffee = new MilkDecorator(coffee);
		coffee = new SugarDecorator(coffee);
		coffee = new WhipCreamDecorator(coffee);

		System.out.println("Order: " + coffee.getDescription());
		System.out.println("Total Cost: $" + coffee.getCost());
	}
}
