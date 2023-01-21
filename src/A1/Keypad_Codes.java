package A1;
import java.util.*;
public class Keypad_Codes {
    static String[] key = { "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wx", "yz" };
    static int count = 0;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String t = sc.next();
        helper(t,"");
        System.out.println();
        System.out.print(count);
    }

    public static void helper(String ques, String ans) {
        if (ques.length() == 0) {
            System.out.print(ans+" ");
            count+=1;
            return;
        }
        char ch = ques.charAt(0);// '1'
        String press = key[ch - '0'];// abc
        for (int i = 0; i < press.length(); i++) {
            helper(ques.substring(1), ans + press.charAt(i));
        }
    }
}
