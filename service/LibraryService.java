package by.epam.library12.service;

import java.util.Comparator;
import java.util.List;

import by.epam.library12.entity.Library;
import by.epam.library12.entity.Book;
import by.epam.library12.service.find.Findable;

public class LibraryService {

	public List<Book> find(Library library, Findable findMatcher, Comparator<Book> comparator) {
		List<Book> units = library.getUnits();
		List<Book> hasFined = null;
		hasFined = findMatcher.find(units,comparator);
		return hasFined;
	}
}
