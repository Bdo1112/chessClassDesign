package com.chess.behaviour;

import com.chess.board.Board;
import com.chess.common.Location;
import java.util.*;
import com.chess.squares.Square;

public interface Action {
    List<Location> getValidMoves(Board board);

    void makeMove(Square square);

}
