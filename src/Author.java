public class Author {
	private String lastName;
	private String firstName;

	public Author(String fName, String lName) {
		this.lastName = lName;
		this.firstName = fName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getFirstName() {
		return firstName;
	}
}
