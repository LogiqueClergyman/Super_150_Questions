package Super150_videos;

public class Backtrack2 {
    public static void infiniteCoins(int[]arr, int sum, String ans, int idx){
        if(sum == 0){
            System.out.println(ans);
            return;
        }
        for(int i = idx; i < arr.length;i++){
            if(sum>=arr[i]){
                int a = arr[i];
//                arr[i] = Integer.MAX_VALUE;
                infiniteCoins(arr,sum-a, ans+ a, i);
//                arr[i] = a;
            }
        }
    }

    public static void main(String[] args) {
        int [] arr = {2,3,4,5};
        infiniteCoins(arr, 10, "",0);
    }
}
