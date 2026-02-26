import java.util.*;
class PalindromeCheckerApp{
    public boolean checkPalindrome(String input){
        int start = 0;
        int end = input.length() - 1;
        boolean isPalindrome = true;
        while(start<end){
            if (input.charAt(start)==input.charAt(end)){
                isPalindrome=true;
                start++;
                end--;
            }
            else{
                isPalindrome = false;
                break;
            }
        }
        return isPalindrome;
    }
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Input : ");
       String sentence = input.nextLine();
       PalindromeCheckerApp obj = new PalindromeCheckerApp();
       boolean res = obj.checkPalindrome(sentence);
       System.out.print("Is Palindrome? : "+res);
       input.close();
    }
}
