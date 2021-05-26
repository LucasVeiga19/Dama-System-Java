package dama;

import boardgame.Board;

public class DamaMatch {
    private Board board;

    public DamaMatch(){
        board = new Board(8, 8);
    }

    public DamaPiece[][] getPieces(){
        DamaPiece[][] mat = new DamaPiece[board.getRows()][board.getColumns()];
        for (int i=0; i< board.getRows(); i++){
            for (int j=0; j< board.getColumns(); j++){
                mat[i][j] = (DamaPiece) board.piece(i, j);
            }
        }
        return mat;
    }
}
