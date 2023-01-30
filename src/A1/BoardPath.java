package A1;
import java.util.*;
public class BoardPath {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int dice = sc.nextInt();
        helper(size, dice, 0, "");
        System.out.println();
        System.out.println(count);
    }
    static int count = 0;
    public static void helper(int size, int dice, int sum, String ans){
        if(sum>size){
            return;
        }
        if(sum == size){
            System.out.print(ans+" ");
            count++;
            return;
        }
        for(int i = 1 ; i <= dice ; i++){
            helper(size, dice, sum+i, ans+Integer.toString(i));
        }
    }
}
