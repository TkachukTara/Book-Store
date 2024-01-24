package mate.academy.Book.Store;

import mate.academy.Book.Store.model.Book;
import mate.academy.Book.Store.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import java.math.BigDecimal;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookStoreApplication {
	private final BookService bookService;

	@Autowired
	public BookStoreApplication(BookService bookService) {
		this.bookService = bookService;
	}

	public static void main(String[] args) {
		SpringApplication.run(BookStoreApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner() {
		return args -> {
			Book newBook = new Book();
			newBook.setTitle("book_title");
			newBook.setAuthor("Taras Tkachuk");
			newBook.setPrice(BigDecimal.valueOf(12.99));
			newBook.setIsbn("ISBN_NEW_BOOK");
			bookService.save(newBook);
			System.out.println("My book = " + bookService.findAll());
		};
	}
}
