package A1;
import java.util.*;
public class Subset_problem {
    static int count = 0;
    public static void main(String[]args) {
        Scanner sc = new Scanner(System.in);
        int nn = sc.nextInt();
        int [] aerr = new int[nn];
        for(int i=0; i<nn; i++){
            aerr[i] = sc.nextInt();
        }
        int target = sc.nextInt();
        ArrayList<String> ans = new ArrayList<String>();
        solve(aerr, nn, 0, 0, target, "");
        System.out.println();
        System.out.print(count);
    }

    private static void solve(int [] arr, int n, int index, int currsum, int target_sum, String ans){
        if(currsum == target_sum){
            System.out.print(ans+" ");
            count++;
            return;
        }

        if(currsum<target_sum && index<n){
            solve(arr, n, index+1, currsum+arr[index], target_sum, ans+ arr[index]+" ");
            solve(arr, n, index+1, currsum, target_sum, ans);
        }
    }
}
