package by.epam.library12.service.find;

import java.util.Comparator;
import java.util.List;

import by.epam.library12.entity.Book;

import by.epam.library12.entity.Book;

public interface Findable {
	List<Book> find(List<Book> units, Comparator<Book> comparator);
}
