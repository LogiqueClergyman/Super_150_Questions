package A1;
import java.util.*;
public class All_Indices_Problem {
    public static void main(String[]args) {

        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<size ; i++){
            arr[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        helper(arr, 0, t);
    }
    public static void helper(int[]arr, int i, int target){
        if(i==arr.length){
            return;
        }

        if(arr[i] == target){
            System.out.print(i + " ");
            // helper(arr, i+1, target);
        }
        helper(arr,i+1,target);
    }
}
