package A1;
import java.util.*;
public class Odd_Even {
        public static void main(String[] args) {
            // Your Code Here
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            odd(n);
            even(n,1);
        }
        public static void odd(int n){
            if(n == 0) return;
            if(n%2 == 1) System.out.println(n);
            odd(n-1);
        }
        public static void even(int n, int i){
            if(i == n+1) return;
            if(i%2 == 0) System.out.println(i);
            even(n,i+1);
        }
}
