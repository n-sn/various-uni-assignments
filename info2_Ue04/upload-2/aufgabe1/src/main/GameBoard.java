package main;

public class GameBoard {
	protected int width;
	protected int height;
	// 0=leer, 1=Spieler A, 2=Spieler B
	protected int[][] fields;
	protected int[] fillState;
	protected boolean first_player;


	public GameBoard(int height, int width) {
		this.width = width;
		this.height = height;
		fields = new int[height][width];
		fillState = new int[width];
		first_player = true;
	}

	public int getField(int row, int col) {
		// ********************
		// Aufgabe a)
		// ********************
	}

	/*
	 * Set chip in field with column col with value player.
	 * In wich row the chip is set, depends on the fillstate of the column (filled from below).
	 *
	 * @param col, player
	 */
	public void playChip(int col, Player player) {
		// ********************
		// Aufgabe a)
		// Klasse muss elber verwalten, wer gerade am Zug war 
		// ********************
	}

	public GameBoard deepCopy() {
		// ********************
		// Aufgabe a)
		// ********************
	}

}
