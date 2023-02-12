package A1;
import java.util.*;
public class Sudoku_Solver {
    public static boolean helperFun(char[][] boardchess){
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(boardchess[i][j]=='0'){
                    for(char c='1';c<='9';c++ ){
                        if(isCheckTrue(boardchess,i,j,c)){
                            boardchess[i][j]=c;
                            if(helperFun(boardchess)) return true;
                            else boardchess[i][j]='0';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isCheckTrue(char[][] boardchess,int row,int col,char c){
        for(int i=0;i<9;i++){
            if(boardchess[row][i]==c) return false;
            if(boardchess[i][col]==c) return false;
            if(boardchess[3*(row/3)+i/3][3*(col/3)+i%3]==c) return false;
        }
        return true;
    }
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char[][] boardchess = new char[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                boardchess[i][j]=sc.next().charAt(0);
            }
        }
        helperFun(boardchess);
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(boardchess[i][j]+" ");
            }
            System.out.println();
        }
    }
}
