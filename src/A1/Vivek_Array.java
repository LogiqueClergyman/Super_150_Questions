package A1;
import java.util.*;

public class Vivek_Array {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i=0;i<t;i++){
            int size= sc.nextInt();
            int[]arr = new int[size];
            long[]sum = new long[size];
            for(int j=0;j<size;j++){
                arr[j]= sc.nextInt();
                if (j>0)
                    sum[j] = (long)arr[j]+sum[j-1];
                else
                    sum[0]= (long)arr[0];
            }
            System.out.println(helper(sum,0));
        }
    }
    public static int helper(long []arr ,int points) {

        int l = arr.length-1;
        if (arr[l]==0){
            points = l;
            return points;
        }
        if (l == 0) return points;
        else if (arr[l]%2 != 0) return points;
        else{
            int pos = Arrays.binarySearch(arr,arr[l]/2);
            if (pos < 0){
                return points;
            }
            long [] left = new long [pos+1];
            long [] right = new long [l-pos];
            System.arraycopy(arr,0,left,0,pos+1);
            System.arraycopy(arr,pos+1,right,0,l-pos);
            for (int i = 0; i<right.length; i++)
                right[i]-=left[pos];
            int pointsleft = helper (left,points+1);
            int pointsright = helper(right,points+1);
            points = Math.max(pointsleft,pointsright);
            return points;
        }
    }
}
