package FeldSpiel;

import java.util.Scanner;

public class Player {
	char[][] playerPosition = new char[9][9];
	Scanner scanner = new Scanner(System.in);
	char[] playerStatus = { '^' };
	int[] coordinatesXY = { 4, 4 };

	public char updatePlayerStatus() {

		char nextAction = askForNextAction();

		if (nextAction == 'l') {
			if (playerStatus[0] == '^') {
				playerStatus[0] = '<';
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = '<';
			}

			if (playerStatus[0] == '>') {
				playerStatus[0] = '^';
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = '^';
			}
		}

		if (nextAction == 'r') {
			if (playerStatus[0] == '^') {
				playerStatus[0] = '>';
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = '>';
			}

			if (playerStatus[0] == '<') {
				playerStatus[0] = '^';
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = '^';
			}
		}
		return playerStatus[0];
	}

	public void updatePlayerPosition() {

		char nextAction = askForNextAction();

		if (nextAction == 'g') {
			if (playerStatus[0] == ('<')) {
				coordinatesXY[0] -= 1;
			}

			if (playerStatus[0] == ('^')) {
				coordinatesXY[1] -= 1;
			}

			if (playerStatus[0] == ('>')) {
				coordinatesXY[0] += 1;
			}

		}

		else
			updatePlayerPosition();
	}

	public int getCoordinateX() {
		return coordinatesXY[0];

	}

	public int getCoordinateY() {
		return coordinatesXY[1];
	}

	public char getPlayerStatusAtPosition(int i, int j) {
		return playerPosition[i][j];
	}

	public char askForNextAction() {
		System.out.println("Führen Sie eine Aktion (g = vorwärts gehen, l = links drehen, r = rechts drehen, q = beenden) aus:");
		char action = scanner.next().charAt(0);
		return action;
	}

}
