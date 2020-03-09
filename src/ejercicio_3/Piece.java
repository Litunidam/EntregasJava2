package ejercicio_3;

enum Piece{
	X("X"),
	O("O");
	
	private final String piece;
	
	Piece(String piece){
		this.piece=piece;
	}
	
	public String getPiece() {
		return this.piece;
	}
}