package Programmieraufgabe14;

import java.util.Scanner;

public class Program {
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		Player player = new Player();
		Field field = new Field();
		
		do {
		field.erasePreviousPlayer(player.getCoordinateX(), player.getCoordinateY());	
		player.updatePlayerStatus(askForNextAction(), '^');
		player.updatePlayerPosition(askForNextAction());
		field.createField(player.getCoordinateX(),player.getCoordinateY(), player.getPlayerStatusAtPosition());
		field.displayField();		
		System.out.println("Willst du nochmal spielen?");
		} 
		while (scanner.next().contains("Ja"));
	}

	public static char askForNextAction() {
		System.out.println("Führen Sie eine Aktion (g = vorwärts gehen, l = links drehen, r = rechts drehen, q = beenden) aus:");
		char action = scanner.next().charAt(0);
		return action;
	}

	
}
