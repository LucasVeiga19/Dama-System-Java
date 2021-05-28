package dama;

import boardgame.Position;

public class DamaPosition {
    private char column;
    private int row;

    public DamaPosition(char column, int row) {
        if (column < 'a' || column > 'h' || row < 1 || row > 8){
            throw new DamaException("Error instantiating DamaPosition. Valid values are from a1 to h8.");
        }
        this.column = column;
        this.row = row;
    }

    public char getColumn() {
        return column;
    }

    public int getRow() {
        return row;
    }

    protected Position toPosition(){
        return new Position(8 - row, column - 'a');
    }

    protected static DamaPosition fromPosition(Position position){
        return new DamaPosition((char)('a' - position.getColumn()), 8 - position.getRow());
    }

    @Override
    public String toString(){
        return ""+column+row;
    }
}
