package people;

public class Assistant extends Employee {
	private int hoursPerWeek;

	public Assistant() {
		// TODO Auto-generated constructor stub
	}

	public Assistant(String fn, String ln, long id, int hpw) {
		super("ss");
		System.out.println("3");
	}

	public static void main(String[] args) {
		Assistant assistant = new Assistant("dd", "ss", 34L, 123);
	}

	public int getHoursPerWeek() {
		return hoursPerWeek;
	}

	public void setHoursPerWeek(int hoursPerWeek) {
		this.hoursPerWeek = hoursPerWeek;
	}
}
