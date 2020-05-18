package Bordergame;

public abstract class Piece {
	
	protected Positon position;
	private Board board;
	
	public Piece(Board board) {
		this.board = board;
		position = null;
	}

	protected Board getBoard() {
		return board;
	}
	
	public abstract boolean[][] possibleMovies();
	
	public boolean possibleMovie(Positon position) {
		return possibleMovies()[position.getRow()][position.getColumn()];
	}
	
	public boolean isThereAnyPossibleMovie() {
		boolean[][] mat = possibleMovies();
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat.length; j++) {
				if (mat[i][j]) {
					return true;
				}
			}
		}
		return false;
	}
	
}
