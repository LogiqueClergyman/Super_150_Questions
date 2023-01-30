package A1;
import java.util.*;
public class TowerOfHanoi {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        helper(n, 'A', 'B', 'C');
    }
    static void helper(int n, char start, char end, char extra)
    {
        if (n == 0) {
            return;
        }
        helper(n - 1, start, extra, end);
        System.out.println("Moving ring " + n + " from "+ start + " to " + end);
        helper(n - 1, extra, end, start);
    }
}
