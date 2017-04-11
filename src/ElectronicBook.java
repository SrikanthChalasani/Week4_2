public class ElectronicBook extends Book {

	public ElectronicBook(String title, Author author) {
		super(title, author);
	}

	public int calculatePrice() {
		return 1;
	}

	public String toString() {
          return String.format("%s",super.toString());
	}
}
