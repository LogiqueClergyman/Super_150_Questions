package A1;
import java.util.*;
public class First_Index {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int [] arr = new int[size];
        for(int i = 0; i < size ; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        helper(arr, 0, t);
    }
    public static void helper(int[]arr, int i, int t){
        if(i==arr.length-1){
            System.out.println(-1);
            return;
        }
        if(arr[i] == t){
            System.out.println(i);
            return;
        }
        helper(arr, i+1, t);
    }
}
