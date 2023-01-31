package A1;
import java.util.*;
public class Split_Array {
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arra = new int[n];
        for (int i = 0; i < n; i++) {
            arra[i] = sc.nextInt();
        }

        int x = helper(arra, 0, 0, 0, "", "");
        System.out.println(x);
    }

    public static int helper(int[] arra, int index, int sum1, int sum2, String str, String str2) {
        if (index == arra.length) {
            if (sum1 == sum2) {
                System.out.println(str+"and "+str2);
                return 1;
            }
            return 0;
        }

        int l = helper(arra, index + 1, sum1 + arra[index], sum2, str + arra[index] + " ",str2);
        int r = helper(arra, index + 1, sum1, sum2 + arra[index], str , str2+ arra[index] + " ");
        return l+r;
    }
}