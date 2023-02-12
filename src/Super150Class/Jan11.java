package Super150Class;

public class Jan11 {

    public static int q1(int []arr, int i){
        if(i == arr.length){
            return -1;
        }
        if(arr[i]!=7){
            return i;
        }
        return q1(arr,i+1);
    }

    public static int q2(int []arr, int i){
        if(i < 0){
            return -1;
        }
        if(arr[i]==7){
            return i;
        }
        return q1(arr,i-1);
    }


    public static void subsequence(String q, String a){
        if(q.length() == 0){
            System.out.println(a + " ");

            return;
        }
        char ch = q.charAt(0);
        subsequence(q.substring(1), a);
        subsequence(q.substring(1), a+ch);
    }

//    public static void coins(String s, int n){
//        if(n==0){
//            System.out.println(s);
//            return;
//        }
////        if(s.length()==0) {
////            coins(s + "H", n - 1);
////            coins(s+"T",n-1);
////        }
////        else {
////            if (s.charAt(s.length() - 1) != 'H') {
//               int a=coins(s + "H", n - 1);
////            }
//           int b=coins(s + "T", n - 1);
////           return a+b;
//        }


    public static int countCoins(String s, int n){
        if(n==0){
            System.out.println(s);
            return 1;
        }
        int a=countCoins(s + "H", n - 1);
        int b=countCoins(s + "T", n - 1);
        return a+b;
    }


    public static void main(String[] args) {
//        int [] arr = {2,3,5,7,2,5,7,9,7};
//        subsequence("abc","");
//        System.out.println(count);
        System.out.println(countCoins("",1));
    }
}
