package CompositeDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		Product phone = new Product("Iphone", 73000);
		Product charger = new Product("Charger", 1009);
		Product earphones = new Product("Samsung earphones", 5012);

		Box smallBox = new Box();
		smallBox.addItem(charger);
		smallBox.addItem(earphones);

		Box bigBox = new Box();
		bigBox.addItem(phone);
		bigBox.addItem(smallBox);

		System.out.println("Total Order Price: $" + bigBox.getPrice());
		System.out.println("Total Order Price FOR small box: $" + smallBox.getPrice());
		System.out.println("Phone Order Price: $" + (phone.getPrice() + charger.getPrice()));

	}
}
