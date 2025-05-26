package CompositeDesignPattern;

public class Product implements Item {

	private String name;
	private int price;

	Product(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public String toString() {
		return name + ": $" + price;
	}
}
