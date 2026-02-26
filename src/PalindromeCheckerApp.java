import java.util.*;

public class PalindromeCheckerApp {
    private static boolean check(String s, int start, int end){
        if (start>=end){
            return true;
        }
        if (s.charAt(start)!=s.charAt(end)){
            return false;
        }
        return check(s, start+1, end-1);
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Input : ");
       String s = input.nextLine();
       int start = 0;
       int end = s.length()-1;
       boolean res = check(s, start, end);
       System.out.print("Is Palindrome? : "+res);
    }
}
