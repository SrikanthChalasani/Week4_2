public class Magazine extends Book {
	private Publisher publisher;

	public Magazine(String title, Author author, Publisher publisher) {
		super(title, author);
		this.publisher = publisher;
	}

	public int calculatePrice() {
		return super.calculatePrice() * 12;
	}

	public String toString() {
		return String.format("%s %s %s", super.toString(),publisher.getName(),publisher.getAddress());
	}
}
