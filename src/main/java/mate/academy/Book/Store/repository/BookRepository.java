package mate.academy.Book.Store.repository;

import mate.academy.Book.Store.model.Book;

import java.util.List;

public interface BookRepository {
    Book save(Book book);

    List<Book> findAll();
}
