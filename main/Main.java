package by.epam.library12.main;

import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import by.epam.library12.comparator.CompareByPrice;
import by.epam.library12.comparator.CompareByPublishedYear;
import by.epam.library12.entity.Book;
import by.epam.library12.entity.Library;
import by.epam.library12.service.LibraryService;
import by.epam.library12.service.find.FindByAuthor;
import by.epam.library12.service.find.Findable;
import by.epam.library12.view.PrintAsList;
import by.epam.library12.view.ViewAction;

public class Main {

	public static void main(String[] args) {
		Library myLibrary = new Library();

		myLibrary.add(new Book("Thinking in Java", 45, "Ekkel", 2016));
		myLibrary.add(new Book("A Tour of C++", 39, "Stroustrup", 1996));
		myLibrary.add(new Book("War and piece", 25, "Tolstoy", 1986));
		myLibrary.add(new Book("Romeo and Juliette", 40, "Shakespeare", 2005));
		myLibrary.add(new Book("Dark alleys", 25, "Bunin", 2010));
		myLibrary.add(new Book("The Karamazovs", 33, "Dostoevsky", 2000));
		myLibrary.add(new Book("White nights", 12, "Dostoevsky", 1998));
		myLibrary.add(new Book("Anna Karenina", 29, "Dostoevsky", 2008));


		myLibrary.remove(new Book("Java", 45, "Java Author", 2016));

		Findable matcher1 = new FindByAuthor("Dostoevsky");

		LibraryService libService = new LibraryService();

		Comparator<Book> priceComparator = new CompareByPrice();
		Comparator<Book> yearComparator = new CompareByPublishedYear();

		List<Book> lists1 = libService.find(myLibrary, matcher1, priceComparator);
		System.out.println("Found by required author: " + lists1.size());
		System.out.println("Sorted by price:");
		ViewAction.print(new PrintAsList(), lists1);

		System.out.println("\n");

		List<Book> lists2 = libService.find(myLibrary, matcher1, yearComparator);
		System.out.println("Found by required author: " + lists2.size());
		System.out.println("Sorted by year:");
		ViewAction.print(new PrintAsList(), lists2);
	}
}