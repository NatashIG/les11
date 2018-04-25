package by.epam.library12.view;

import java.util.List;

import by.epam.library12.entity.Book;

public class ViewAction {
	public static void print(Printable printObj, List<Book> lists) {
		printObj.print(lists);
	}
}
