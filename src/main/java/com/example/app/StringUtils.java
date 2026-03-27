package com.example.app;

/**
 * Utility class for common string operations.
 */
public class StringUtils {

    /**
     * Reverses the given string.
     *
     * @param input the string to reverse
     * @return the reversed string, or null if input is null
     */
    public String reverse(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

    /**
     * Checks whether the given string is a palindrome (case-insensitive).
     *
     * @param input the string to check
     * @return true if the string is a palindrome, false otherwise
     * @throws IllegalArgumentException if input is null
     */
    public boolean isPalindrome(String input) {
        if (input == null) {
            throw new IllegalArgumentException("Input must not be null");
        }
        String cleaned = input.toLowerCase().replaceAll("[^a-z0-9]", "");
        return cleaned.equals(new StringBuilder(cleaned).reverse().toString());
    }

    /**
     * Counts the number of words in the given string.
     *
     * @param input the string to count words in
     * @return the number of words, or 0 if input is null or blank
     */
    public int countWords(String input) {
        if (input == null || input.isBlank()) {
            return 0;
        }
        return input.trim().split("\\s+").length;
    }
}
