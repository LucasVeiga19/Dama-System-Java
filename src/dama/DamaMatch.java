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
        placeNewPiece('a', 1, new Stone(board, Color.RED));
        placeNewPiece('c', 1, new Stone(board, Color.RED));
        placeNewPiece('e', 1, new Stone(board, Color.RED));
        placeNewPiece('g', 1, new Stone(board, Color.RED));
        placeNewPiece('b', 2, new Stone(board, Color.RED));
        placeNewPiece('d', 2, new Stone(board, Color.RED));
        placeNewPiece('f', 2, new Stone(board, Color.RED));
        placeNewPiece('h', 2, new Stone(board, Color.RED));
        placeNewPiece('a', 3, new Stone(board, Color.RED));
        placeNewPiece('c', 3, new Stone(board, Color.RED));
        placeNewPiece('e', 3, new Stone(board, Color.RED));
        placeNewPiece('g', 3, new Stone(board, Color.RED));

        placeNewPiece('b', 8, new Stone(board, Color.BLUE));
        placeNewPiece('d', 8, new Stone(board, Color.BLUE));
        placeNewPiece('f', 8, new Stone(board, Color.BLUE));
        placeNewPiece('h', 8, new Stone(board, Color.BLUE));
        placeNewPiece('a', 7, new Stone(board, Color.BLUE));
        placeNewPiece('c', 7, new Stone(board, Color.BLUE));
        placeNewPiece('e', 7, new Stone(board, Color.BLUE));
        placeNewPiece('g', 7, new Stone(board, Color.BLUE));
        placeNewPiece('b', 6, new Stone(board, Color.BLUE));
        placeNewPiece('d', 6, new Stone(board, Color.BLUE));
        placeNewPiece('f', 6, new Stone(board, Color.BLUE));
        placeNewPiece('h', 6, new Stone(board, Color.BLUE));
    }
}
