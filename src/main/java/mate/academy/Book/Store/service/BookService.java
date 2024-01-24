package mate.academy.Book.Store.service;

import mate.academy.Book.Store.model.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    List<Book> findAll();
}
