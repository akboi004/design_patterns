package IteratorDesignPattern;

public class ClientCode {

	public static void main(String[] args) {
		BookCollection bookCollection = new BookCollection();
		bookCollection.addBook("Book A");
		bookCollection.addBook("Book B");

		Iterator<String> iterator = bookCollection.createIterator();
		while (iterator.hasNext()) {
			System.out.println(iterator.next());
		}
	}
}
