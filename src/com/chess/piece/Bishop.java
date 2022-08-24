package com.chess.piece;

import com.chess.behaviour.Action;
import com.chess.board.Board;
import com.chess.common.Location;
import com.chess.squares.Square;

import java.util.List;

public class Bishop extends AbstractPiece implements Action {

    public Bishop(PieceColor peiceColor){
        super(peiceColor);
        this.name = "Bishop";
    }

    @Override
    public List<Location> getValidMoves(Board board) {
        System.out.println(this.name);
        return null;
    }

    @Override
    public void makeMove(Square square) {

    }
}
