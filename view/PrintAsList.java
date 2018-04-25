package by.epam.library12.view;

import java.util.List;

import by.epam.library12.entity.Book;

public class PrintAsList implements Printable {

    @Override
    public void print(List<Book> units) {
        for (Book book : units) {
            System.out.println(book);
        }
    }
}
