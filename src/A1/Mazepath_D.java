package A1;
import java.util.*;
public class Mazepath_D {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        PrintAnswer(x, y, 0, 0, "");
        System.out.println();
        System.out.println(count);
    }
    static int count=0;
    public static void PrintAnswer(int n, int m, int cc, int cr, String ans) {
        if (cc == m - 1 && cr == n - 1) {
            System.out.print(ans + " ");
            count+=1;
            return;
        }
        if (cc >= m || cr >= n) {
            return;
        }
        PrintAnswer(n, m, cc, cr + 1, ans + "V");
        PrintAnswer(n, m, cc + 1, cr, ans + "H");
        PrintAnswer(n, m, cc + 1, cr + 1, ans + "D");

    }
}
