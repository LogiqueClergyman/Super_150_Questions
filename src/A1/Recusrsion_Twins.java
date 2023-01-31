package A1;

import java.util.*;
public class Recusrsion_Twins {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(countTwins(s,0));
    }
    // static int count = 0;
    private static int countTwins(String str, int index) {
        if (index >= str.length() - 2) {
            return 0;
        }
        int count = 0;
        if (str.charAt(index) == str.charAt(index + 2)) {
            count++;
        }
        return count + countTwins(str, index + 1);
    }
}

