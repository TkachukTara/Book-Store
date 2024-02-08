package book.store.service;

import book.store.dto.BookDto;
import book.store.dto.BookSearchParameters;
import book.store.dto.CreateBookRequestDto;
import java.util.List;

public interface BookService {
    BookDto save(CreateBookRequestDto createBookRequestDto);

    List<BookDto> findAll();

    BookDto findById(Long id);

    void deleteById(Long id);

    BookDto updateBook(Long id, CreateBookRequestDto updatedBook);

    List<BookDto> search(BookSearchParameters params);

}
