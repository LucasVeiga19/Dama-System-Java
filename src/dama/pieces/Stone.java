package dama.pieces;

import boardgame.Board;
import boardgame.Position;
import dama.Color;
import dama.DamaPiece;

public class Stone extends DamaPiece {
    public Stone(Board board, Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "\uD83D\uDD18";
    }

    private boolean canMove(Position position){
        DamaPiece p = (DamaPiece) getBoard().piece(position);
        return p == null || p.getColor() != getColor();
    }

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];

        Position p = new Position(0, 0);

        // nw
        p.setValues(position.getRow()-1, position.getColumn()-1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // ne
        p.setValues(position.getRow()-1, position.getColumn()+1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // sw
        p.setValues(position.getRow()+1, position.getColumn()-1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        // se
        p.setValues(position.getRow()+1, position.getColumn()+1);
        if (getBoard().positionExists(p) && canMove(p)){
            mat[p.getRow()][p.getColumn()] = true;
        }

        return mat;
    }
}
