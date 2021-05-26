package dama;

import boardgame.Board;
import boardgame.Piece;

public class DamaPiece extends Piece {
    private Color color;

    public DamaPiece(Board board, Color color) {
        super(board);
        this.color = color;
    }

    public Color getColor() {
        return color;
    }
}
