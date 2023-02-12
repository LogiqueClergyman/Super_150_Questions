package Super150_videos;

public class BackTrack_4 {

    public static void partitioningAString(String s, String ans){
        if(s.length() == 0){
            System.out.println(ans);
            return;
        }
        for(int i = 1 ; i <= s.length() ; i++){
            if(palindCheck(s.substring(0,i)))
                partitioningAString(s.substring(i), ans + s.substring(0,i) +" | ");
        }
    }

    public static boolean palindCheck(String s){
        for(int i = 0 ; i < s.length(); i++){
//            if(i == s.length()-i){
//                return true;
//            }
            if(s.charAt(i) != s.charAt(s.length()-i-1)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        partitioningAString("NITIN", "");
    }
}
