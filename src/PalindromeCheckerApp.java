import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner text = new Scanner(System.in);
       System.out.print("Input : ");
       String input = text.nextLine();
       Deque<Character> deque = new ArrayDeque<>();
       for (char c : input.toCharArray()){
           deque.add(c);
       }
       boolean isPalindrome = true;
       while (deque.size() > 1){
           char front = deque.removeFirst();
           char rear = deque.removeLast();
           if (front!=rear){
               isPalindrome=false;
               break;
           }
           isPalindrome = true;
       }
       System.out.print("Is Palindrome? : "+isPalindrome);
    }
}
