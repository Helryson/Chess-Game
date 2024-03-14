package program;

import java.util.Scanner;

import chessLayer.ChessMatch;
import chessLayer.ChessPiece;
import chessLayer.ChessPosition;

public class Programa {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();
		
		while(true) {
			UI.printBoard(chessMatch.getPieces());
			System.out.println();
			System.out.println("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			System.out.println();
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece caputredPiece = chessMatch.performChessMovie(source, target);
		}
		
	}
	
}
