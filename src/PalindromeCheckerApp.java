import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Input text: ");
       String text = input.nextLine();
       String ab="";
       String ba="";
       for (int i=0; i<=text.length()/2; i++){
           ab= ab+ text.charAt(i);
       }
       for (int i=text.length()-1; i>=text.length()/2; i--){
           ba= ba+ text.charAt(i);
       }
       System.out.print("Is it a Palindrome? : "+(ab.equals(ba)));
    }
}
