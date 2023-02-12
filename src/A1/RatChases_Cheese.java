package A1;

import java.util.*;
public class RatChases_Cheese {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int m = sc.nextInt();
            char[][]qmaze = new char[n][m];
            int[][]amaze = new int[n][m];
            for(int i = 0 ; i < n ; i++){
                String s =sc.next();
                for(int j = 0 ; j < s.length() ; j++){
                    qmaze[i][j] = s.charAt(j);
                }
            }
            helper(qmaze, amaze, 0, 0);
            if(check == false){
                System.out.println("NO PATH FOUND");
            }
        }

        static boolean check = false;

        public static void helper(char[][]qmaze, int[][]amaze, int row, int col){

            int[]rows = {1, 0, -1, 0};
            int[]columns = {0, -1, 0, 1};

            if(row<0 || row>=qmaze.length || col<0 || col>=qmaze[0].length || qmaze[row][col]=='X')
                return;

            qmaze[row][col]='X';
            amaze[row][col]=1;

            if(row == qmaze.length-1 && col == qmaze[0].length-1){
                displayTheAns(amaze);
                check = true;
                return;
            }

            for(int i = 0 ; i<rows.length ; i++){
                helper(qmaze, amaze, row+rows[i], col+columns[i]);
            }

            qmaze[row][col]='O';
            amaze[row][col]=0;
        }

        public static void displayTheAns(int[][]amaze){
            for(int i = 0 ; i<amaze.length ; i++){
                for(int j = 0; j<amaze[0].length; j++){
                    System.out.print(amaze[i][j] +" ");
                }
                System.out.println();
            }
        }
    }
