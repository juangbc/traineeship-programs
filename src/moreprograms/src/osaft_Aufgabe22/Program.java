package osaft_Aufgabe22;

public class Program {

	public static void main(String[] args) throws Exception {
		
		OsaftLaden osaftLaden = new OsaftLaden();
		osaftLaden.glasOsaft();
		
		try {
			osaftLaden.trinken();
		}
		
		catch(OsaftException exception) {
			System.out.println("die temperatur ist krass");
		}
		
		try {
			osaftLaden.buyGlas();
		}
		
		catch(OsaftException exception) {
			System.out.println("No more Gläser");
		}

	}
	
}
