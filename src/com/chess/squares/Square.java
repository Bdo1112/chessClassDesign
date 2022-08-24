package com.chess.squares;

import com.chess.common.Location;

public class Square {

    private final SquareColor sqaureColor;
    private final Location location;
    private boolean isOccupied;

    public Square(SquareColor sqaureColor, Location location){
        this.sqaureColor = sqaureColor;
        this.location = location;
        this.isOccupied = false;
    }

    public void reset(){
        this.isOccupied = false;
    }

    public SquareColor getSqaureColor() {
        return sqaureColor;
    }

    public Location getLocation() {
        return location;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public void setOccupied(boolean occupied) {
        isOccupied = occupied;
    }

    @Override
    public String toString() {
        return "Sqaure{" +
                "sqaureColor=" + sqaureColor +
                ", location=" + location +
                ", isOccupied=" + isOccupied +
                '}';
    }
}
