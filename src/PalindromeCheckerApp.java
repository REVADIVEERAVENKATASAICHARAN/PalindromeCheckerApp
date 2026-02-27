import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC7.
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        // Define the input string to validate
        String input = "refer";

        // Create a Deque to store characters
        Deque<Character> deque = new LinkedList<>();

        // Insert each character into deque
        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        // Flag to track palindrome status
        boolean isPalindrome = true;

        // Compare characters from both ends
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input : " + input);
        System.out.println("Is Palindrome? : " + isPalindrome);
    }
}