import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner text = new Scanner(System.in);
       System.out.print("Input : ");
       String input = text.nextLine();
       Stack<Character> stack = new Stack<>();
       for (char c : input.toCharArray()){
           stack.push(c);
       }
       boolean isPalindrome = true;
       for (char c : input.toCharArray()){
           if (stack.pop()==c){
               isPalindrome=true;
           }else {
               isPalindrome=false;
           }
       }
       System.out.print("Is Palindrome? : "+isPalindrome);
    }
}
