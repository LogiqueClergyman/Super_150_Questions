package A1;
import java.util.*;
public class RecursionObedient_String {
    public static void main(String[]args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        if (s.charAt(0)=='a'){
            System.out.println(helperFun(s));
        }
        else System.out.println(false);
    }
    public static boolean helperFun(String s){
        if (s.length()==0){
            return true;
        }
        int var1=0;
        int var2=0;
        int let1=0;
        int let2=0;
        if (s.charAt(0)=='a') {
            let1=1;
            if (s.substring(1) .equals("") || s.charAt(1)=='a') {
                var1=1;
            } else if (s.length()>=3 &&  s.substring(1,3) .equals("bb") ) {
                var1=1;
            }
        }if ( s.length()>=2 && s.substring(0,2).equals("bb")) {
            let2=1;
            if (s.substring(2) .equals("") || s.charAt(2)=='a') {
                var2=1;
            }
        }
        if (let1==1 && var1!=1)
            return false;
        if (let2==1 && var2!=1)
            return false;
        return helperFun(s.substring(1));
    }
}
