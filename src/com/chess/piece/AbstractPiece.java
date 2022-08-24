package com.chess.piece;

import com.chess.squares.Square;

public abstract class AbstractPiece {
    protected String name;
    protected PieceColor pieceColor;
    protected Square currentSquareLocation;

    public AbstractPiece(PieceColor pieceColor){
        this.pieceColor = pieceColor;
    }

    public String getName() {
        return name;
    }
    public PieceColor getPieceColor() {
        return pieceColor;
    }
    public Square getCurrentSquareLocation() {
        return currentSquareLocation;
    }
    public void setCurrentSquareLocation(Square currentSquareLocation) {
        this.currentSquareLocation = currentSquareLocation;
    }
}
