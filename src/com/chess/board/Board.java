package com.chess.board;

import com.chess.squares.Square;

public class Board {
    private static final Integer BOARD_LENGTH = 8;
    Square[][] boardSquare = new Square[BOARD_LENGTH][BOARD_LENGTH];

    public Board(){
        //Create a chess board
    }

    public void printBoard(){
        for(Square[] row : boardSquare){
            for(Square sqr:row){
                System.out.print(sqr);
            }
            System.out.println();
        }
    }

}
