package Super150Class;

public class Jan12 {

    public static void dice4ways(int src, int dest, String ans){
        if(src==dest){
            System.out.println(ans);
        }
        if(src>dest){
            return;
        }
        dice4ways(src+1,dest,ans+1);
        dice4ways(src+2,dest,ans+2);
        dice4ways(src+3,dest,ans+3);
    }


    public static void diceNways(int src, int dest, String ans){
        if(src==dest){
            System.out.println(ans);
        }
        if(src>dest){
            return;
        }
        for(int i = 1; i <=4 ; i++){   //i <= no.of dice faces. ex: from 1 to 3 in this case
            diceNways(src+i,dest,ans+i);
        }
    }


    public static void LeetCodeQ22(int n , String ans, int open, int close){
        if(open == n && close == n){
            System.out.println(ans);
            return;
        }
        if(open < n){
//            ans+="(";
            LeetCodeQ22(n,ans+"(",open+1,close);
        }
        if(close<open){
//            ans+=")";
            LeetCodeQ22(n,ans+")",open,close+1);
        }
    }


    public static void main(String[]args){
//        diceNways(0,5,"");
        LeetCodeQ22(1,"",0,0);
    }
}
