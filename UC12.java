import java.util.*;
class PalindromeCheckerApp {
    interface PalindromeStrategy {
        boolean check(String input);
        String name();
    }
    static class StackStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            String s = normalize(input);
            Stack<Character> stack = new Stack<>();
            for (char c : s.toCharArray()) {
                stack.push(c);
            }
            for (char c : s.toCharArray()) {
                if (stack.pop() != c) return false;
            }
            return true;
        }
        public String name() {
            return "StackStrategy";
        }
    }
    static class DequeStrategy implements PalindromeStrategy {
        public boolean check(String input) {
            String s = normalize(input);
            Deque<Character> dq = new ArrayDeque<>();
            for (char c : s.toCharArray()) {
                dq.addLast(c);
            }
            while (dq.size() > 1) {
                if (dq.removeFirst() != dq.removeLast()) return false;
            }
            return true;
        }
        public String name() {
            return "DequeStrategy";
        }
    }
    static class PalindromeChecker {
        private PalindromeStrategy strategy;
        public PalindromeChecker(PalindromeStrategy strategy) {
            this.strategy = strategy;
        }
        public boolean isPalindrome(String input) {
            return strategy.check(input);
        }
        public String strategyName() {
            return strategy.name();
        }
    }
    static String normalize(String input) {
        return input.replaceAll("\\s+", "").toLowerCase();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input : ");
        String input = sc.nextLine();
        System.out.println("1. Stack Strategy");
        System.out.println("2. Deque Strategy");
        System.out.print("Choose Strategy : ");
        int choice = sc.nextInt();
        PalindromeStrategy strategy;
        if (choice == 2)
            strategy = new DequeStrategy();
        else
            strategy = new StackStrategy();
        PalindromeChecker checker = new PalindromeChecker(strategy);
        boolean result = checker.isPalindrome(input);
        System.out.println("Is Palindrome? : " + result);
    }
}
