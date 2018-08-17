package heater_Aufgabe21;

public class Program {

	public static void main (String[] args) throws Exception {
		Heater heater = new Heater();
		try 
		{
			heater.setStufe();
		}
		catch(WrongNumberException e)
		{
			System.out.println("Die gewählte Stufe ist nicht korrekt");
		}
	}
}
