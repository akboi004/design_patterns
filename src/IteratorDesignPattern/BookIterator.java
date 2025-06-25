package IteratorDesignPattern;

import java.util.List;

public class BookIterator implements Iterator<String> {

	private List<String> books;
	private int index = 0;

	public BookIterator(List<String> books) {
		this.books = books;
	}

	@Override
	public boolean hasNext() {
		return index < books.size();
	}

	@Override
	public String next() {
		return books.get(index++);
	}

}
