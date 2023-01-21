package A1;
import java.util.*;
public class CountRemoveReplace {
    public static void main(String[]args) {
        // Your Code Here
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        remove(s,"",0,0);
        replace(s,"",0);

    }

    public static void replace(String s, String ans, int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }
        if(i<s.length()-2 && s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            replace(s, ans+"bye",i+2);
        }
        else replace(s,ans+s.charAt(i),i+1);
    }
    public static void remove(String s, String ans, int i, int count){
        if(i==s.length()){
            System.out.println(count);
            System.out.println(ans);
            return;
        }
        if(i<s.length()-2 && s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            remove(s, ans, i+2,count+1);
        }
        else remove(s,ans+s.charAt(i),i+1,count);
    }
}
