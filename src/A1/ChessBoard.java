package A1;
import java.util.*;
public class ChessBoard {
    static int count=0;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        printPaths(t,1,1,"{0-0}");
        System.out.println();
        System.out.println(count);
        System.out.println();
    }
    public static void printPaths(int N, int row, int col, String path) {
        if (row == N && col == N) {
            System.out.print(path+" ");
            count++;
            return;
        }
        if (row > N || col > N) {
            return;
        }

        printPaths(N, row+2, col+1, path + "K{" + (row+2-1) +"-"+ (col+1-1) + "}");
        printPaths(N, row+1, col+2, path + "K{" + (row+1-1) +"-"+ (col+2-1) + "}");

        if (row == 1 || row == N || col == 1 || col == N) {
            for(int i = 1 ; i <= N ; i++){
                printPaths(N, row, col+i, path + "R{" + (row-1) +"-"+ (col+i-1) + "}");
                printPaths(N, row+i, col, path + "R{" + (row+i-1) +"-"+ (col-1) + "}");
            }
        }
        if( row == col){
            for(int i = 1 ; i <= N ; i++){
                printPaths(N, row+i, col+i, path + "B{" + (row+i-1) +"-"+ (col+i-1) + "}");
            }
        }
    }
}
