package A1;

import java.util.*;
public class Mapped_String {
    static ArrayList<String> list = new ArrayList<>();

    public static void main(String[]args) {
        // Your Code Here

        Scanner sc = new Scanner(System.in);
        String s = sc.next();

        int[] num = new int[s.length()];
        for (int i = 0; i < s.length(); i++){
            num[i] = s.charAt(i) - '0';
        }

        helper(num, 0, "");
        for (String value : list) {
            System.out.println(value);
        }
    }

    public static void helper(int[] num, int index, String str) {
        if (index == num.length) {
            list.add(str);
            return;
        }

        int digit1 = num[index];
        char ch1 = (char)('A' + digit1 - 1);
        helper(num, index + 1, str + ch1);

        if (index + 1 < num.length) {
            int digit2 = num[index] * 10 + num[index + 1];
            if (digit2 <= 26) {
                char ch2 = (char)('A' + digit2 - 1);
                helper(num, index + 2, str + ch2);
            }
        }
    }
}