package chesss;

import boardgame.Board;
import chesss.ChessPiece.ChesssPiece;


public class ChessMatch {

	
	private Board board;
	
	public ChessMatch() {
		board = new Board(8, 8);
	}
	
	public ChesssPiece[][]getPieces(){
		ChesssPiece[][]mat = new ChesssPiece[board.getRows()][board.getColumns()];
		for (int i=0; i<board.getRows(); i++) {
			for (int j=0; j<board.getColumns(); j++) {
				mat[i][j] = (ChesssPiece) board.piece(i, j);
			}
		}
		
		return mat;
	}
	
}

