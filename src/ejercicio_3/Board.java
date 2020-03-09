package ejercicio_3;

import java.util.*;

public class Board {

	static String [][] board = new String[3][3];
	static Player player1=new Player(Piece.O);
	static Player player2=new Player(Piece.X);
	
	public Board() {
		
		for (int i=0;i<3;i++) {
			for (int j=0;j<3;j++) 
				board[i][j]=" ";
		}
	}
	public String[][] getBoard() {
		return this.board;
	}
	public void setBoard(String[][] board) {
		this.board=board;
	}
	
	static void firstTurn() {
		Random r = new Random();
		int random;
		random=r.nextInt(2);
		
		if (random==0) {
			turn(player1);
		}else
			turn(player2);
	}
	
	public static void turn(Player player) {
		Scanner s = new Scanner(System.in);
		int row;
		int col;
		
		System.out.println("Introduce la fila: ");
		row=s.nextInt();
		s.nextLine();
		System.out.println("Introduce la columna:");
		col=s.nextInt();
		s.nextLine();
		
		addMark(player1.piece,row,col);
		
	}
	
	
	static void addMark(Piece p,int row,int col) {
		if (board[row][col].equals("X")||board[row][col].equals("O")) {
			System.out.println("No se puede marcar esa posisición porque ya está marcada");
		}else
			board[row][col]=p.getPiece();
	}
	
	
	
	@Override
	public String toString() {
		String s=" | "+board[0][0]+" | "+board[0][1]+" | "+board[0][2]+" | "
				+"\n"+"_______________"+"\n"+
				" | "+board[1][0]+" | "+board[1][1]+" | "+board[1][2]+" | "
				+"\n"+"_______________"+"\n"+
				" | "+board[2][0]+" | "+board[2][1]+" | "+board[2][2]+" | ";		
		return s;
	}
}
