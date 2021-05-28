package dama;

import boardgame.Board;
import boardgame.Position;
import dama.pieces.Stone;

public class DamaMatch {
    private Board board;

    public DamaMatch(){
        board = new Board(8, 8);
        initialSetup();
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

    private void placeNewPiece(char column, int row, DamaPiece piece){
        board.placePìece(piece, new DamaPosition(column, row).toPosition());
    }

    private void initialSetup(){
        placeNewPiece('b', 6, new Stone(board, Color.WHITE));
        placeNewPiece('e', 8, new Stone(board, Color.BLACK));
        placeNewPiece('e', 1, new Stone(board, Color.WHITE));
    }
}
