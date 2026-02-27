/**
 * ======================================================
 * MAIN CLASS - UseCase4PalindromeCheckerApp
 * ======================================================
 *
 * Use Case 4: Character Array Based Validation
 *
 * Description:
 * This class validates a palindrome by converting
 * the string into a character array and comparing
 * characters using the two-pointer technique.
 *
 * @author Developer
 * @version 4.0
 */

public class PalindromeCheckerApp {

    /**
     * Application entry point for UC4.
     *
     * @param args Command-line arguments
     */
    public static void main(String[] args) {

        String input = "radar";  // Hardcoded input
        char[] characters = input.toCharArray();

        int start = 0;
        int end = characters.length - 1;
        boolean isPalindrome = true;

        while (start < end) {
            if (characters[start] != characters[end]) {
                isPalindrome = false;
                break;
            }
            start++;
            end--;
        }

        System.out.println("Input : " + input);

        if (isPalindrome) {
            System.out.println("Is Palindrome? : true ");
        } else {
            System.out.println("Is Palindrome? : false");
        }
    }
}