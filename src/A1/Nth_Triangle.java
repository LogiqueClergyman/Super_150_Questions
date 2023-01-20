package A1;
import java.util.*;
public class Nth_Triangle {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(helper(0,n));
    }
    public static int helper(int ans, int n){
        if(n==0) return ans;
        return helper(ans+n,n-1);
    }
}
