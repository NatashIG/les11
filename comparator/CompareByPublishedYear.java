package by.epam.library12.comparator;

import by.epam.library12.entity.Book;

import java.util.Comparator;

public class CompareByPublishedYear implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        if (book1.getPublishedYear() < book2.getPublishedYear()) {
            return -1;
        } else if (book1.getPublishedYear() == book2.getPublishedYear()) {
            return 0;
        } else {
            return 1;
        }
    }
}
