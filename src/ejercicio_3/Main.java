package ejercicio_3;
public class Main {

	public static void main(String []args) {

		Board board = new Board();

		switch (board.menu()) {
			case 1:
				board.game();
				break;
			case 2:
				board.gameWithMachine();
			case 3:
				board.gameOnlyMachines();
			default:
			break;
		}
		
		
		
	}

}
