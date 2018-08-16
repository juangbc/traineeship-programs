package people;

public class Person {

	private String firstName;
	private String lastName;

	public Person() {
		System.out.println("1");
		// TODO Auto-generated constructor stub
	}

	public Person(String fn, String ln) {

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
