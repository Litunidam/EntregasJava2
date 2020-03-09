package ejercicio_3;
import java.util.Random;
public class Main {

	public static void main(String []args) {

		Board board = new Board();
		Player player1=new Player(Piece.O);
		Player player2=new Player(Piece.X);
		
		int row;
		int col;
		
		System.out.println(board);
		
		
	}
	static int firstTurn() {
		Random r = new Random();
		return r.nextInt(2);
	}
}
