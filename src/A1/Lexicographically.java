package A1;
import java.util.*;
public class Lexicographically {
    public static void main(String[]args) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        solve(0, t);
    }
    private static void solve(int current, int t){
        if(current>t){
            return;
        }
        System.out.print(current+" ");
        int i=0;
        if(current == 0){
            i=1;
        }
        for (; i <= 9; i++) {
            solve(current*10+i, t);
        }
    }
}
