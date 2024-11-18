package firstNonRepeatingLetter;

import java.util.LinkedHashMap;
import java.util.Map;

public class MyFirstNonRepeatingLetter {

    public static String firstNonRepeatingLetter(String input) {
        if (input == null || input.isEmpty()) {
            return "";
        }

        // Create a LinkedHashMap to preserve insertion order
        Map<Character, Integer> charCount = new LinkedHashMap<>();

        // Iterate over the input string to count character occurrences (case-insensitive)
        for (char c : input.toCharArray()) {
            char lowerCaseChar = Character.toLowerCase(c);
            charCount.put(lowerCaseChar, charCount.getOrDefault(lowerCaseChar, 0) + 1);
        }

        // Iterate again to find the first non-repeating character
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (charCount.get(Character.toLowerCase(c)) == 1) {
                return String.valueOf(c);
            }
        }

        // Return empty string if no unique character is found
        return "";
    }
}
