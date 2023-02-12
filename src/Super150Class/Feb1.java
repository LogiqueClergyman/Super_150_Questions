package Super150Class;

import java.util.ArrayList;

public class Feb1 {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<>();
        breakIntoAllPossibleCombs("NITIN", "");
        printAllPossiblePalindromes("NITIN", arr);
    }

    public static void breakIntoAllPossibleCombs(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }

        for(int i = 1 ; i <= s.length(); i++){
            breakIntoAllPossibleCombs(s.substring(i), ans+s.substring(0, i) + " | ");
        }
    }

    public static void printAllPossiblePalindromes(String s, ArrayList<String> arr){
        if(s.length() == 0){
//            arr.add(s);
            return;
        }

        for(int i = 1 ; i <= s.length(); i++){
            if(palindrome(s.substring(0 ,i)))
                breakIntoAllPossibleCombs(s.substring(i), arr+s.substring(0, i) + " | ");
                arr.remove(arr.size()-1);
        }
    }
    public static boolean palindrome(String s){
        for(int i = 0 ; i < s.length()/2 ; i++){
            if(s.charAt(i) != s.charAt((s.length()-i-1)))
                return false;
        }
        return true;
    }
}
