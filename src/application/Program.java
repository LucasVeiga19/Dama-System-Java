package application;

import dama.DamaMatch;
import dama.DamaPiece;
import dama.DamaPosition;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DamaMatch damaMatch = new DamaMatch();

        while (true){
            UI.printBoard(damaMatch.getPieces());
            System.out.println();
            System.out.print("Source: ");
            DamaPosition source = UI.readDamaPosition(sc);

            System.out.println();
            System.out.print("Target: ");
            DamaPosition target = UI.readDamaPosition(sc);

            DamaPiece capturedPiece = damaMatch.performDamaMove(source, target);
        }
    }
}
