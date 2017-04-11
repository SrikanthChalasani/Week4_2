import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class MagazineTest {
	Publisher publisher;
	Author author;
	Magazine magazine;

	@Before
	public void setUp() throws Exception {
		publisher = new Publisher("NY Co", "1234 York St, NY");
		author = new Author("John", "Doe");
		magazine = new Magazine("Computer Science", author, publisher);
	}

	@Test
	public void Magazinetest() {
		assertEquals(84,magazine.calculatePrice());
	}

	@Test
	public void MagazinePrinttest() {
		assertEquals("Computer Science John Doe NY Co 1234 York St, NY",magazine.toString());
	}
}
