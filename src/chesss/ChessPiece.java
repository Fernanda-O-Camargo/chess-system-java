package chesss;

import boardgame.Board;
import boardgame.Piece;

public class ChessPiece {
	
	public class ChesssPiece extends Piece{
		
		private Color color;
		
		public ChesssPiece(Board board, Color color) {
			super(board);
			this.color = color;
		}

		public Color getColor() {
			return color;
		}

	}

}
