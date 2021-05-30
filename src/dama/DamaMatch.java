package dama;

import boardgame.Board;
import boardgame.BoardException;
import boardgame.Piece;
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

    public DamaPiece performDamaMove(DamaPosition sourcePosition, DamaPosition targetPosition){
        Position source = sourcePosition.toPosition();
        Position target = targetPosition.toPosition();
        validateSourcePosition(source);
        Piece capturedPiece = makeMove(source, target);
        return (DamaPiece) capturedPiece;
    }

    private Piece makeMove(Position source, Position target){
        Piece p = board.removePiece(source);
        Piece capturedPiece = board.removePiece(target);
        board.placePìece(p, target);
        return capturedPiece;
    }

    private void validateSourcePosition(Position position){
        if (!board.thereIsAPiece(position)){
            throw new BoardException("There is no piece on source position");
        }
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
