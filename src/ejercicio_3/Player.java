package ejercicio_3;

public class Player {
	
	Piece piece;
	
	public Player(Piece piece) {
		this.piece=piece;
	}
	public String getPiece() {
		return this.piece.getPiece();
	}
	public void setPiece(Board board,int row,int col){
		
		board.board[row][col]=this.piece.getPiece();
		board.setBoard(board.board);
	}
}
