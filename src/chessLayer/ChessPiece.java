package chessLayer;

import boardLayer.Board;
import boardLayer.Piece;

public class ChessPiece extends Piece{
	
	protected Color color;

	public ChessPiece(Board board, Color color) {
		super(board);
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

}