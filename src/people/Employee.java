package people;

public class Employee extends Person {

	private long employeeID;

	public Employee() { // TODO Auto-generated constructor stub 

	}

	public Employee(String fn) {
		super("ss", "ee");
		System.out.println("aaaaa");
	}

	public long getEmployeeID() {
		return employeeID;
	}

	public void setEmployeeID(long employeeID) {
		this.employeeID = employeeID;
	}

}
