package calculator;

public class Divisible {

	public static void main (String[] args) {
		
		for (int i = 1; i <= 100; ++i) {
			System.out.println(i);

			
			
			if ( i%3 == 0 && i%4 == 0)
			{
				System.out.println("Durch 3 und 4 teilbar");
			}
			
			else if ( i%3 == 0)
			{
				System.out.println("Durch 3 teilbar");
			}
			
			else if ( i%4 == 0)
			{
				System.out.println("Durch 4 teilbar");
			}
			
			
		}		
	}
	
	
}
