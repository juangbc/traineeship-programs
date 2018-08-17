package Programmieraufgabe14;

import java.util.Scanner;

public class Player {
	char[][] playerPosition = new char[9][9];
	Scanner scanner = new Scanner(System.in);
	int[] coordinatesXY = { 4, 4 };
	char[] playerSymbols = {'<','^','>','v'};
	char[] counterPlayer = {4};
	
	public char updatePlayerStatus(char nextAction, char previousStatus) {

		if (nextAction == 'l') {
			
			if (previousStatus == playerSymbols[0]) {
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[3];
			}
			
			else 
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[previousStatus -1];
		}	
				
		if (nextAction == 'r') {	
					
			if (previousStatus == playerSymbols[3]) {
						playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[0];
					}
					
			else 
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[previousStatus +1];
				}
		
		return playerPosition[coordinatesXY[0]][coordinatesXY[1]];
				
		
	/*

		if (nextAction == 'r') {
			if (previousStatus == '^') {
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = '>';
			}

			if (previousStatus == '<') {
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = '^';
			}
		}
		
		if (nextAction != 'l' && nextAction != 'r')
		{
			updatePlayerStatus(new Program().askForNextAction(), previousStatus);
		}
		*/
	}

	public void updatePlayerPosition(char nextAction) {

		if (nextAction == 'g') {
			
			if (playerPosition[coordinatesXY[0]][coordinatesXY[1]] == playerSymbols[0]) {
				coordinatesXY[1] -= 1;
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[0];
			}

			if (playerPosition[coordinatesXY[0]][coordinatesXY[1]] == playerSymbols[1]) {
				coordinatesXY[0] += 1;
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[1];
			}
			
			if (playerPosition[coordinatesXY[0]][coordinatesXY[1]] == playerSymbols[2]) {
				coordinatesXY[1] += 1;
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[2];
			}
			
			if (playerPosition[coordinatesXY[0]][coordinatesXY[1]] == playerSymbols[3]) {
				coordinatesXY[0] -= 1;
				playerPosition[coordinatesXY[0]][coordinatesXY[1]] = playerSymbols[3];
			}
		}
		
		else
			updatePlayerPosition(new Program().askForNextAction());
	}

	public int getCoordinateX() {
		return coordinatesXY[0];
	}

	public int getCoordinateY() {
		return coordinatesXY[1];
	}

	public char getPlayerStatusAtPosition() {
		return playerPosition[coordinatesXY[0]][coordinatesXY[1]];
	}



}
