package ejercicio_3;

public class Player {
	
	private Piece piece;
	
	public Player(Piece piece) {
		this.piece=piece;
	}
	
	public void setPiece(Board board,int row,int col){
		
		board.board[row][col]=this.piece.getPiece();
		board.setBoard(board.board);
	}
}
