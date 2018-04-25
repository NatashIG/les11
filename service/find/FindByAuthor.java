package by.epam.library12.service.find;

import java.util.*;

import by.epam.library12.entity.Book;

public class FindByAuthor implements Findable {
	private String author;

	public FindByAuthor(String author) {
		this.author = author;
	}

	@Override
	public List<Book> find(List<Book> units, Comparator<Book> comparator) {
		Set<Book> resultUnits = new TreeSet<Book>(comparator);

		for (int i = 0; i < units.size(); i++) {
			Book obj = units.get(i);
			if (author == obj.getAuthor()) {
				resultUnits.add(obj);
			}
		}
		return new ArrayList<Book>(resultUnits);
	}
}