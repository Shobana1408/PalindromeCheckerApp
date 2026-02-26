import java.util.*;
class PalindromeCheckerApp{
    public static void main(String[] args){
       Scanner input = new Scanner(System.in);
       System.out.print("Input : ");
       String sentence = input.nextLine();
       String text="";
       for (int i=0; i<sentence.length(); i++) {
           if (sentence.charAt(i)!=' ') {
               text += Character.toLowerCase(sentence.charAt(i));
           }
       }
       System.out.println(text);
        String ab="";
        String ba="";
        for (int i=0; i<=text.length()/2; i++){
            ab= ab+ text.charAt(i);
        }
        for (int i=text.length()-1; i>=text.length()/2; i--){
            ba= ba+ text.charAt(i);
        }
        System.out.println(ab+"  "+ba);
        System.out.print("Is Palindrome? : "+(ab.equals(ba)));
    }
}
