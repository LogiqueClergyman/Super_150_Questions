package A1;
import java.util.*;
public class Replace_Hi2 {
    public static void main(String[]args) {
        // Your Code Here
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
//        remove(s,"",0);
        replace("abchihitfhi","",0);

    }

    public static void replace(String s, String ans, int i){
        if(i==s.length()){
            System.out.println(ans);
            return;
        }

        if(i<s.length()-3 && s.charAt(i)=='h' && s.charAt(i+1)=='i' && s.charAt(i+2)=='t'){
            replace(s, ans+s.charAt(i)+s.charAt(i+1)+s.charAt(i+2), i+3);
        }
        else if(i<s.length()-3 && s.charAt(i)=='h' && s.charAt(i+1)=='i' && s.charAt(i+2)!='t'){
            replace(s, ans+"bye",i+2);
        }

        else if(i==s.length()-2 && s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            replace(s, ans+"bye",i+2);
        }
        else replace(s,ans+s.charAt(i),i+1);
    }
    static int count = 0;
    public static void remove(String s, String ans, int i){
        if(i==s.length()){
            System.out.println(count);
            System.out.println(ans);
            return;
        }
        else if(i<s.length()-3 && s.charAt(i)=='h' && s.charAt(i+1)=='i' && s.charAt(i+2)!='t'){
            count += 1;
            remove(s, ans, i+2);
        }
        else if(i<s.length()-3 && s.charAt(i)=='h' && s.charAt(i+1)=='i' && s.charAt(i+2)=='t'){
            count += 1;
            remove(s, ans+s.charAt(i)+s.charAt(i+1), i+2);
        }
        else if(i==s.length()-2 && s.charAt(i)=='h' && s.charAt(i+1)=='i'){
            count += 1;
            remove(s, ans, i+2);
        }

        else remove(s,ans+s.charAt(i),i+1);
    }
}
