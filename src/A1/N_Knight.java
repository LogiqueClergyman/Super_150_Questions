package A1;
import java.util.*;
public class N_Knight {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        char boardChess[][] = new char[n][n];
        for (int i = 0; i < boardChess.length; i++) {
            for (int j = 0; j < boardChess.length; j++) {
                boardChess[i][j] = 'X';
            }
        }
        KnightPiece(boardChess, n, 0, 0);
        System.out.println();
        System.out.println(Tcounter);
    }

    static int Tcounter = 0;

    public static void KnightPiece(char boardChess[][], int tq, int roww, int column) {
        if (tq == 0) {
            printboardChess(boardChess);
            System.out.print("  ");
            Tcounter++;
            return;
        }
        if (roww == boardChess.length)
            return;
        int newroww = roww, newcolumn = column + 1;
        if (newcolumn == boardChess.length) {
            newroww = roww + 1;
            newcolumn = 0;
        }
        if (checkForSafe(boardChess, roww, column)) {
            boardChess[roww][column] = 'Q';
            KnightPiece(boardChess, tq - 1, newroww, newcolumn);
            boardChess[roww][column] = 'X';
        }
        KnightPiece(boardChess, tq, newroww, newcolumn);
    }

    public static boolean checkForSafe(char boardChess[][], int roww, int column) {
        if (roww >= 2 && column + 1 < boardChess.length && boardChess[roww - 2][column + 1] == 'Q')
            return false;
        if (roww >= 2 && column >= 1 && boardChess[roww - 2][column - 1] == 'Q')
            return false;
        if (roww >= 1 && column + 2 < boardChess.length && boardChess[roww - 1][column + 2] == 'Q')
            return false;
        if (roww >= 1 && column >= 2 && boardChess[roww - 1][column - 2] == 'Q')
            return false;
        return true;
    }

    public static void printboardChess(char boardChess[][]) {
        for (int i = 0; i < boardChess.length; i++) {
            for (int j = 0; j < boardChess.length; j++) {
                if (boardChess[i][j] == 'Q')
                    System.out.print("{" + i + "-" + j + "}" + " ");
            }
        }
    }
}
