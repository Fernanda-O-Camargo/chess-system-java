package chesss.pieces;

import boardgame.Board;
import chesss.ChessPiece;
import chesss.Color;

public class Rook extends ChessPiece{

	public Rook(Board board, Color color) {
		super(board, color);
		
	}
	@Override
	public String toString() {
		return "R";
	}
}

