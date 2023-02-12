package A1;
import java.util.*;
public class Rat_Maze {
    static boolean check= false;

    public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);

        int m=sc.nextInt();
        int n= sc.nextInt();
        char [][] qmazer=new char[m][n];
        for (int i = 0; i <qmazer.length ; i++) {
            String str=sc.next();

            for (int j = 0; j <str.length() ; j++) {
                qmazer[i][j]=str.charAt(j);

            }
        }
        int [][] amaze=new int[m][n];
        helper(qmazer,0,0,amaze);
        if(check==false){
            System.out.println(-1);
        }
    }
    public static void helper(char[][]qmaze,int r,int c,int [][]amaze){
        if(r==qmaze.length-1&&c==qmaze[0].length-1&& qmaze[r][c]!='X'){
            amaze[r][c]=1;
            displayTheamaze(amaze);
            check=true;
            return;
        }
        if(r>=qmaze.length || c>=qmaze[0].length||qmaze[r][c]=='X'){
            return;
        }

//        int[] r={0,1};
//        int []r={1,0};
//        for (int i = 0; i <r.length ; i++) {
        if(check==false) {
            qmaze[r][c] = 'X';
            amaze[r][c] = 1;
            helper(qmaze, r, c + 1, amaze);
            helper(qmaze, r + 1, c, amaze);
            qmaze[r][c] = 'O';
            amaze[r][c] = 0;
        }

//        }



    }
    public static void displayTheamaze(int[][]amaze){
        for (int i = 0; i <amaze.length ; i++) {
            for (int j = 0; j <amaze[0].length ; j++) {
                System.out.print(amaze[i][j]+" ");
            }
            System.out.println();
        }
    }
}
