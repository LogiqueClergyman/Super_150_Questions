package A1;
import java.util.*;
public class Dictionary_bigger {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        char [] arr = s.toCharArray();
        Arrays.sort(arr);
        String p = Arrays.toString(arr);
        p = p.substring(1,p.length()-1).replaceAll(",","").replaceAll(" ","");
        // System.out.println(p);

        helper(s,p,"");
    }
    public static void helper(String s, String p, String ans){
        if(p.length() == 0){
            if(ans.compareTo(s)>0){
                System.out.println(ans);
                return;
            }
            else return;
        }

        for(int i = 0 ; i < p.length() ; i++){
            helper(s, p.substring(0,i)+p.substring(i+1), ans+p.charAt(i));
        }
    }
}
