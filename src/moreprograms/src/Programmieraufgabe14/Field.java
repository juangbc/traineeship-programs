package Programmieraufgabe14;


public class Field {
	char[][] field = new char[10][10];

	public void createField(int coordinateX, int coordinateY, char player) {
		
		for (int j = 0; j < field.length; j++) {
			for (int i = 0; i < field[j].length; i++) {
				field[j][0] = '#';
				field[j][9] = '#';

				if (j == 0 || j == 9) {
					field[j][i] = '#';
				}
				
				if (coordinateY == i) {
					if (coordinateX == j) {
						field[coordinateX][coordinateY] = player;
					}
				}
			}
		}
	}

	
	public void displayField() {
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}

	}
	
	public void erasePreviousPlayer(int coordinateX, int coordinateY) {
		for (int j = 0; j < field.length; j++) {
			for (int i = 0; i < field[j].length; i++) {
				if (coordinateY == i) {
					if (coordinateX == j) {
						field[coordinateX][coordinateY] = ' ';
					}
				}
			}
		}
		
	}

}


