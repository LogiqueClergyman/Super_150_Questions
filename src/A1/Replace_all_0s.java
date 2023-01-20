package A1;
import java.util.*;
public class Replace_all_0s {
    public static void main (String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        helper(n,0,1);
    }
    public static void helper(int n, int ans, int i){
        while (n > 0) {
            if(n%10 != 0)
                ans=ans + i*(n%10);
            else ans=ans+i*(5);
            n/=10;
            i=i*10;
        }
        System.out.println(ans);
    }
}
