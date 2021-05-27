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

    private void initialSetup(){
        board.placePìece(new Stone(board, Color.BLACK), new Position(0, 6));
        board.placePìece(new Stone(board, Color.BLACK), new Position(5, 6));

        board.placePìece(new Stone(board, Color.WHITE), new Position(2, 3));
        board.placePìece(new Stone(board, Color.WHITE), new Position(5, 4));
    }
}
