package com.chess.piece;

import com.chess.behaviour.Action;
import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class Knight extends AbstractPiece implements Action {

    public Knight(PieceColor peiceColor){
        super(peiceColor);
        this.name = "Knight";
    }

    @Override
    public List<Location> getValidMoves(Board board) {

        System.out.println(this.getName() + "-> getValidMoves()");
        return null;
    }

    @Override
    public void makeMove(Square square) {
        System.out.println(this.getName() + "-> makeMove()");

    }
}
