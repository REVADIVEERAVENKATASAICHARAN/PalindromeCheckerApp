
public class PalindromeCheckerApp {

    public static void main(String[] args) {

        String input = "A man a plan a canal Panama";
        String normalized = input.replaceAll("[^a-zA-Z]", "").toLowerCase();

        // Two Pointer Algorithm
        long start1 = System.nanoTime();
        boolean result1 = twoPointerPalindrome(normalized);
        long end1 = System.nanoTime();

        // Stack Algorithm
        long start2 = System.nanoTime();
        boolean result2 = stackPalindrome(normalized);
        long end2 = System.nanoTime();

        System.out.println("Input : " + input);

        System.out.println("\nTwo Pointer Result : " + result1);
        System.out.println("Execution Time : " + (end1 - start1) + " ns");

        System.out.println("\nStack Result : " + result2);
        System.out.println("Execution Time : " + (end2 - start2) + " ns");
    }

    // Algorithm 1: Two Pointer
    public static boolean twoPointerPalindrome(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Algorithm 2: Stack Method
    public static boolean stackPalindrome(String input) {

        java.util.Stack<Character> stack = new java.util.Stack<>();

        for (int i = 0; i < input.length(); i++) {
            stack.push(input.charAt(i));
        }

        for (int i = 0; i < input.length(); i++) {

            if (input.charAt(i) != stack.pop()) {
                return false;
            }
        }

        return true;
    }
}