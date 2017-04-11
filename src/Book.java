public class Book implements IBook {
	private String title;
	private Author author;

	public Book(String title, Author author)
	{
		this.title = title;
		this.author = author;
	}
	@Override
	public int calculatePrice() {
		return this.author.getFirstName().length()
				+ this.author.getLastName().length();
	}
	
	public String toString()
	{
		return String.format("%s %s %s",this.title,this.author.getFirstName(),this.author.getLastName());		
	}
}
