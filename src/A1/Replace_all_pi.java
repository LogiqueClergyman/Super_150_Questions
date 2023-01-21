package A1;
import java.util.*;
public class Replace_all_pi {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            String s = sc.next();
            helper(s,"",0);
        }
    }
    public static void helper(String s, String ans, int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(i<s.length()-2 && s.charAt(i)=='p' && s.charAt(i+1)=='i'){
            helper(s, ans+"3.14",i+2);
        }
        else helper(s,ans+s.charAt(i),i+1);
    }
}
