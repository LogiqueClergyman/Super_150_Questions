package A1;
import java.util.*;
public class CountRemoveReplace2 {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a = helperCounting(s);
        System.out.println(a);
        helperSolving(s, "", "");
    }
    private static int helperCounting(String str) {
        if (str.length() < 2) {
            return 0;
        }

        if (str.substring(0, 2).equals("hi") && (str.length() < 3 || str.charAt(2) != 't')) {
            return 1 + helperCounting(str.substring(2));
        } else {
            return helperCounting(str.substring(1));
        }
    }

    private static void helperSolving(String in, String out, String out1){
        if(in.length() == 0){
            System.out.println(out);
            System.out.println(out1);
            return;
        }

        char ch = in.charAt(0);
        if(in.length()>2 && ch=='h' && in.charAt(1)=='i' && in.charAt(2)=='t') helperSolving(in.substring(3), out+"hit", out1+"hit");
        else if(in.length()>1 && ch=='h' && in.charAt(1)=='i') helperSolving(in.substring(2), out, out1+"bye");
        else helperSolving(in.substring(1), out+ch, out1+ch);
    }
}
