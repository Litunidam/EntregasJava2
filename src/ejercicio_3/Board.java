package ejercicio_3;

public class Board {

	public String [][] board = new String[3][3];
	
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
