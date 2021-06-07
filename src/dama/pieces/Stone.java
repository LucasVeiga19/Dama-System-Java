package dama.pieces;

import boardgame.Board;
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

    @Override
    public boolean[][] possibleMoves() {
        boolean[][] mat = new boolean[getBoard().getRows()][getBoard().getColumns()];
        return mat;
    }
}
