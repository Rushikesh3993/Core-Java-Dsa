// Write a java method to compute the sum of the digits in an integer
// Example: 123 -> 6 (1+2+3), -123 -> 6 (ignoring the sign)

package Function_question;

public class Sum_of_digit {

    /**
     * Computes the sum of digits of an integer.
     * Handles both positive and negative numbers.
     *
     * @param n the integer whose digits will be summed
     * @return the sum of digits
     */
    public static int sumOfDigit(int n) {
        n = Math.abs(n); // Handle negative numbers by taking absolute value
        int sum = 0;
        while (n > 0) {
            int ldg = n % 10;   // Get last digit
            sum = sum + ldg;   // Add to sum
            n = n / 10;        // Remove last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOfDigit(12345));  // Output: 15
        System.out.println(sumOfDigit(-123));   // Output: 6
        System.out.println(sumOfDigit(0));      // Output: 0
    }
}
