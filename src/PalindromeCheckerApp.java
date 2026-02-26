import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner text = new Scanner(System.in);
       System.out.print("Input : ");
       String input = text.nextLine();
       Queue<Character> queue = new LinkedList<>();
       Stack<Character> stack = new Stack<>();
       for (char c : input.toCharArray()){
           stack.push(c);
           queue.add(c);
       }
       boolean isPalindrome = true;
       while (!queue.isEmpty()){
           if (queue.remove()==stack.pop()){
               isPalindrome = true;
           }
           else {
               isPalindrome = false;
           }
       }
       System.out.print("Is Palindrome? : "+isPalindrome);
    }
}
