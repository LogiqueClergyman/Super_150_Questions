package Super150Class;
public class Jan18 {



    public static void question1(int n, int m, int cc, int cr, String ans){
        if(cc == m-1 && cr == n-1){
            System.out.println(ans);
            return;
        }
        if(cc>=m || cr>=n){
            return;
        }
        question1(n, m, cc, cr +1, ans + "V");
        question1(n, m, cc+1, cr, ans + "H");

    }

    public static void stringPermutations(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 0; i < s.length(); i++){
            if(s.lastIndexOf(s.charAt(i)) == i)
            stringPermutations(s.substring(0,i)+s.substring(i+1), ans+s.charAt(i));
        }

    }

    public static void main(String[] args) {
//        int [][] arr=new int[3][3];
//        question1(3,4,0,0,"");
        stringPermutations("abcaa","");
    }
}
