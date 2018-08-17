package mixer_aufgabe20;

import java.util.Arrays;

public class Mixer {
	
	
	public static String mixer1 (String wort) {
		String ersterBuchstabe = wort.substring(1, 2);
		String letzterBuchstabe = wort.substring(wort.length()-1, wort.length());
		String mittlererTeil = wort.substring(1, wort.length()-1);
		return letzterBuchstabe + mittlererTeil + ersterBuchstabe;
	}
	
	
	public static String mixer2 (String wort) {
		
		int halfString = wort.length() / 2;
		String wort1 = wort.substring(0, halfString);
		String wort2 = wort.substring(halfString, wort.length());
		wort = wort2.concat(wort1);
		return wort;
	}
	
	public static String mixer3 (String wort) {
		String wort1 = wort.substring(0, wort.length()-3);
		String wort2 = wort.substring(wort.length()-3, wort.length()).toUpperCase();
		return wort1 + wort2;
	}


}
