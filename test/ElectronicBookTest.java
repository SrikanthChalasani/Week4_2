import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ElectronicBookTest {
	Author author;
	ElectronicBook electronicbook;

	@Before
	public void setUp() throws Exception {
		author = new Author("John", "Doe");
		electronicbook = new ElectronicBook("E Book",author);		
	}

	@Test
	public void ElectronicBooktest() {
		assertEquals(1,electronicbook.calculatePrice());
	}
	
	@Test
	public void ElectronicBookPrinttest() {
		assertEquals("E Book John Doe",electronicbook.toString());
	}

}
