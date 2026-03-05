import java.util.*;
class PalindromeCheckerApp {
    static boolean algoTwoPointer(String s) {
        int i = 0, j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) return false;
            i++;
            j--;
        }
        return true;
    }
    static boolean algoReverse(String s) {
        String rev = new StringBuilder(s).reverse().toString();
        return s.equals(rev);
    }
    static boolean algoDeque(String s) {
        ArrayDeque<Character> dq = new ArrayDeque<>();
        for (int i = 0; i < s.length(); i++) dq.addLast(s.charAt(i));
        while (dq.size() > 1) {
            if (!dq.removeFirst().equals(dq.removeLast())) return false;
        }
        return true;
    }
    static String normalize(String s) {
        StringBuilder out = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c)) out.append(Character.toLowerCase(c));
        }
        return out.toString();
    }
    static void test(String name, String input, java.util.function.Predicate<String> fn) {
        long start = System.nanoTime();
        boolean ans = fn.test(input);
        long end = System.nanoTime();
        System.out.println(name + " -> " + ans + " | Execution Time: " + (end - start) + " ns");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String raw = sc.nextLine();
        String s = normalize(raw);
        System.out.println("Normalized : " + s);
        test("Two Pointer", s, PalindromeCheckerApp::algoTwoPointer);
        test("Reverse String", s, PalindromeCheckerApp::algoReverse);
        test("Deque", s, PalindromeCheckerApp::algoDeque);
    }
}
