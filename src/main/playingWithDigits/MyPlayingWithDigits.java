package main.playingWithDigits;

public class MyPlayingWithDigits {
    public static long digPow(int n, int p) {
        String numberStr = String.valueOf(n); // Convert the number to a string to process each digit
        int sum = 0;

        // Loop through each digit of the number
        for (int i = 0; i < numberStr.length(); i++) {
            int digit = Character.getNumericValue(numberStr.charAt(i)); // Get the digit
            sum += Math.pow(digit, p + i); // Raise the digit to the power p + i and add to the sum
        }

        // Check if sum is divisible by n
        if (sum % n == 0) {
            return sum / n; // Return k if it exists
        } else {
            return -1; // Return -1 if k does not exist
        }
    }
}
