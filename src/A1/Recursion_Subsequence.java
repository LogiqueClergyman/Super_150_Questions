package A1;
import java.util.*;
public class Recursion_Subsequence {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int x = (helper(s,""));
        System.out.println();
        System.out.println(x);
    }
    public static int helper(String s, String ans) {
        // TODO Auto-generated method stub
        if (s.length() == 0) {
            System.out.print(ans+" ");
            return 1;
        }

        char ch = s.charAt(0);
        int a = helper(s.substring(1), ans);
        int b = helper(s.substring(1), ans + ch);
        return a + b;

    }
}
