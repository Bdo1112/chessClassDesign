package com.chess.runner;

import com.chess.behaviour.Action;
import com.chess.board.Board;
import com.chess.piece.Pawn;
import com.chess.piece.PieceColor;

public class Game {
    public static void main(String[] args){
        Board board = new Board();
        board.printBoard();

        PieceColor color = PieceColor.DARK;
        Action pawn = new Pawn(color);
        System.out.println();
        Game.printPeice(pawn);
    }

    public static void printPeice(Action peice){
        peice.getValidMoves(null);
        peice.makeMove(null);
    }
}
