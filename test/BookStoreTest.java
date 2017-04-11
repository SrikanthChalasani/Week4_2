import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

public class BookStoreTest {
	Author author1, author2;
	Publisher publisher;
	Book book1, book2;
	ElectronicBook electronicBook;
	Magazine magazine1;
	List<Book> books;

	@Before
	public void setUp() throws Exception {
		author1 = new Author("Mary", "Beth Doe");
		author2 = new Author("Johnson", "David Jr");
		publisher = new Publisher("NY Co", "123 Dow St, NY");

		books = new ArrayList<>();
		books.add(new Book("Mary Loves", author1));
		books.add(new Book("Baby Ruth Jr", author2));
		books.add(new Magazine("New York Printing Co.", author2, publisher));
		books.add(new ElectronicBook("Elec Book", author1));
	}

	@Test
	public void Book1test() {
				int totalprice = 0;
				for (Book book:books)
				{
					totalprice = totalprice + book.calculatePrice();
				}
		assertEquals(208, totalprice);
	}	

}
