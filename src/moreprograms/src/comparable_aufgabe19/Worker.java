package comparable_aufgabe19;

public class Worker implements Comparable {
	
	String nachname;
	int id;

	public Worker (String nachname, int id) {
		this.nachname = nachname;
		this.id = id;
	}
	
	@Override
	public int compareTo(Object arg0) {
		if (arg0 instanceof Worker ) {
			Worker worker = (Worker) arg0;
			
			if (this.nachname.compareToIgnoreCase(worker.nachname) <0) {
				return -1;
			}
			
			if (this.nachname.compareToIgnoreCase(worker.nachname) >0) {
				return 1;
			}
			
			if (this.nachname.compareToIgnoreCase(worker.nachname) == 0) {
		
				if (this.id < worker.id) {
					return -1;	
				}
				
				if (this.id > worker.id) {
					return 1;	
				}
			
			return 1;
			}
			
		}
		return 0;
	}
}