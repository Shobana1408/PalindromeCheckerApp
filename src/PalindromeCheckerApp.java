import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner text = new Scanner(System.in);
       System.out.print("Input : ");
       String input = text.nextLine();
       char[] chars = input.toCharArray();
       int start = 0;
       int end = chars.length-1;
       boolean isPalindrome = true;
       while(start!=end){
           if (chars[start]==chars[end]){
               isPalindrome = true;
               start++;
               end--;
           }
           else{
               isPalindrome = false;
               break;
           }
       }
       System.out.print("Is Palindrome? : "+isPalindrome);
    }
}
