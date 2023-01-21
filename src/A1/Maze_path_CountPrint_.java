package A1;
import java.util.*;
public class Maze_path_CountPrint_ {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        helper("",x,y,0,0);
        System.out.println();
        System.out.println(count);
    }
    static int count = 0;
    public static void helper(String ans, int x, int y, int xx, int yy){
        if(xx==x-1 && yy==y-1){
            System.out.print(ans + " ");
            count += 1;
            return;
        }
        if(xx>=x || yy>=y){
            return;
        }
        helper(ans + "V",x,y,xx+1,yy);
        helper(ans + "H",x,y,xx,yy+1);
    }
}
