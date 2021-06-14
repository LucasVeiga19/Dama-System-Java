package application;

import dama.DamaException;
import dama.DamaMatch;
import dama.DamaPiece;
import dama.DamaPosition;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        DamaMatch damaMatch = new DamaMatch();
        List<DamaPiece> captured = new ArrayList<>();

        while (true){
            try {
                UI.clearScreen();
                UI.printMatch(damaMatch, captured);
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

                if (capturedPiece != null){
                    captured.add(capturedPiece);
                }
            } catch (DamaException | InputMismatchException e){
                System.out.println(e.getMessage());
                sc.nextLine();
            }
        }
    }
}
