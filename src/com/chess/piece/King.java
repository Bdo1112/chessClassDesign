package com.chess.piece;

import com.chess.behaviour.Action;
import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class King extends AbstractPiece implements Action {

    public King(PieceColor peiceColor){
        super(peiceColor);
        this.name = "King";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        System.out.println(this.getName() + "-> getValidMoves()");
        return null;
    }

    @Override
    public void makeMove(Square square) {
        System.out.println(this.getName()  + "-> makeMoves()");

    }
}
