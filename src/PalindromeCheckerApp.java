import java.util.*;

public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner text = new Scanner(System.in);
       System.out.print("Input : ");
       String input = text.nextLine();
       LinkedList<Character> list = new LinkedList<>();
       for (char c : input.toCharArray()){
           list.add(c);
       }
       boolean isPalindrome = true;
       while (list.size() > 1){
           if (list.getFirst()!=list.getLast()){
               isPalindrome = false;
               break;
           }
           list.removeFirst();
           list.removeLast();
           isPalindrome = true;
       }
       System.out.print("Is Palindrome? : "+isPalindrome);
    }
}
