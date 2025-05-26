package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Box implements Item {

	List<Item> items = new ArrayList<>();

	public void addItem(Item item) {
		items.add(item);
	}

	@Override
	public int getPrice() {
		int total = 0;
		for (Item item : items) {
			total += item.getPrice();
		}
		return total;
	}

	public String toString() {
		return "Box with " + items.size() + " items, Total Price: $" + getPrice();
	}

}
