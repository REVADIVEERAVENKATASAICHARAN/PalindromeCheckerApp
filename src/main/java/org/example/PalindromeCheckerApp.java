public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "madam";

        // Choose strategy
        PalindromeStrategy strategy = new StackStrategy();

        boolean result = strategy.checkPalindrome(input);

        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + result);
    }
}


interface PalindromeStrategy {

    boolean checkPalindrome(String input);
}


class StackStrategy implements PalindromeStrategy {

    public boolean checkPalindrome(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        // Push characters into stack
        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        // Compare while popping
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}