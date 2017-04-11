import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class BooksTest {
        Book book;
        Author author = new Author("John","Doe");
	@Before
	public void setUp() throws Exception {
		
		book = new Book("Harry Potter",author);
	}

	@Test
	public void CalculatePricetest() {
		assertEquals(7,book.calculatePrice());
	}
	
	@Test
	public void PrintBooktest() {
		assertEquals("Harry Potter John Doe",book.toString());
	}

}
