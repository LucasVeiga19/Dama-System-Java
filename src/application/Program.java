package application;

import dama.DamaException;
import dama.DamaMatch;
import dama.DamaPiece;
import dama.DamaPosition;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DamaMatch damaMatch = new DamaMatch();

        while (true){
            try {
                UI.clearScreen();
                UI.printBoard(damaMatch.getPieces());
                System.out.println();
                System.out.print("Source: ");
                DamaPosition source = UI.readDamaPosition(sc);

                boolean[][] possibleMoves = damaMatch.possibleMoves(source);
                UI.clearScreen();
                UI.printBoard(damaMatch.getPieces(), possibleMoves);
                System.out.println();
                System.out.print("Target: ");
                DamaPosition target = UI.readDamaPosition(sc);

                DamaPiece capturedPiece = damaMatch.performDamaMove(source, target);
            } catch (DamaException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
