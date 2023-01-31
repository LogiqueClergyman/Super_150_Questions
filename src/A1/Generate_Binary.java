package A1;
import java.util.*;
public class Generate_Binary {
        public static void main(String[]args) {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0){
                String s = sc.next();
                helper(s,"");
                System.out.println();
            }
        }
        public static void helper(String s, String ans){
            if(s.length() == 0){
                System.out.print(ans +" ");
                return;
            }


            // for(int i = 0 ; i < s.length() ; i++){
            if(s.charAt(0) == '?'){
                helper(s.substring(1), ans+"0");
                helper(s.substring(1), ans+"1");
            }
            else{
                helper(s.substring(1), ans + s.charAt(0));
            }

        }
    }
