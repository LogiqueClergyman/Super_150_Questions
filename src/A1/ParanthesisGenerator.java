package A1;
import java.util.*;
public class ParanthesisGenerator {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        List<String> ll = new ArrayList<>();
        Parentheses(n, "", 0, 0,ll);
        for(int i = ll.size()-1; i >=0; i--){
            System.out.println(ll.get(i));
        }
    }
    public static void Parentheses(int n, String ans, int open, int close,List<String> ll) {
        if (open ==n&& close==n) {
            //System.out.print(ans + " ");
            ll.add(ans);
            return;
        }
        if (open < n) {
            Parentheses(n, ans + "(", open + 1, close,ll);
        }
        if (close < open) {
            Parentheses(n, ans + ")", open, close + 1,ll);
        }

    }
}
