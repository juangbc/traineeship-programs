package FeldSpiel;

public class Field {

	Player player = new Player();
	char[][] field = new char[10][10];

	public void createFieldBorders() {

		for (int i = 0; i < field.length; i++) {

			for (int j = 0; j < field[i].length; j++) {
				field[i][0] = '#';
				field[i][9] = '#';

				if (i == 0 || i == 9) {
					field[i][j] = '#';
				}

				if (player.getCoordinateX() == i) {
					if (player.getCoordinateY() == j) {
						field[player.getCoordinateX()][player.getCoordinateY()] = 's';
						//	System.out.print(player.getPlayerStatusAtPosition(i, j));
					}
				}

			}
		}
	}

	public void displayField() {

		player.updatePlayerStatus();
		player.updatePlayerPosition();
		createFieldBorders();

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}

	}

}

/*
 * if (player.getCoordinateY() == i) { if (player.getCoordinateX() == j) { System.out.print(player.playerPosition[i][j]); } } public void savePlayerIntoField() {
 * field[player.getCoordinateX()][player.getCoordinateY()] = '?'; }
 */
