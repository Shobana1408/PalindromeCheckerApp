import java.util.Scanner;
public class PalindromeCheckerApp {
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Input text: ");
       String text = input.nextLine();
       String ab="";
       for (int i=text.length()-1; i>=0; i--){
           ab= ab+ text.charAt(i);
       }
       System.out.print("Is it a Palindrome? : "+(ab.equals(text)));
    }
}
