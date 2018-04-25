package by.epam.library12.comparator;

import java.util.Comparator;

import by.epam.library12.entity.Book;

public class CompareByPrice implements Comparator<Book> {
    public int compare(Book book1, Book book2) {

        if (book1.getPrice() < book2.getPrice()) {
            return -1;
        } else if (book1.getPrice() == book2.getPrice()) {
            return 0;
        } else {
            return 1;
        }
    }
}