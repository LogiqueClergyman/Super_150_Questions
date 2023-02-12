package A1;
import java.util.*;
public class N_Queen {
    static int count=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] boardChess = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boardChess[i][j]='.';
            }
        }
        helperFun(0,boardChess);
        System.out.println(count);
    }
    public static boolean helperCheck(int roww,int column,char[][] boardChess){
        int dupr=roww;
        int dupc=column;
        //for upper diagonal
        while(column>=0 && roww>=0){
            if(boardChess[roww][column]=='Q') return false;
            roww--;
            column--;
        }
        roww=dupr;
        column=dupc;
        //for left roww
        while (column >= 0) {
            if (boardChess[roww][column] == 'Q')
                return false;
            column--;
        }
        // for lower diagonal
        roww = dupr;
        column = dupc;
        while (roww < boardChess.length && column >= 0) {
            if (boardChess[roww][column] == 'Q')
                return false;
            roww++;
            column--;
        }
        return true;
    }
    public static void helperFun(int column,char[][] boardChess) {
        if (column == boardChess.length) {
            ++count;
            return;
        }
        for (int roww = 0; roww < boardChess.length; roww++) {
            if (helperCheck(roww, column, boardChess)) {
                boardChess[roww][column] = 'Q';
                helperFun(column + 1, boardChess);
                boardChess[roww][column] = '.';
            }
        }
    }
}
