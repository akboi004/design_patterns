package DecoratorDesignPattern;

public class WhipCreamDecorator extends CoffeeDecorator {

	public WhipCreamDecorator(Coffee coffee) {
		super(coffee);
	}

	public String getDescription() {
		return coffee.getDescription() + ", Whip Cream";
	}

	public double getCost() {
		return coffee.getCost() + 2.2;
	}
}
