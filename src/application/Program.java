package application;

import dama.DamaMatch;

public class Program {
    public static void main(String[] args) {

        DamaMatch damaMatch = new DamaMatch();
        UI.printBoard(damaMatch.getPieces());
    }
}
