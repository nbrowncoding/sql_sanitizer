package com.nickbrowncoding.sql_sanitizer;

/**
 * @author nbrown
 * @date 2023-03-04
 * @description Sanitizes SQL input to remove unwanted characters that may allow SQL injection attacks.
 */
public class SQLSanitizer {

    /**
     * Sanitizes the input by removing all non-alphanumeric character and restricted characters
     * @param input - The value that should be sanitized
     * @return - The original value after being sanitized
     */
    static String sanitize(String input) {

        // Replace all characters in an input string that is not a letter, number or underscore.
        return input.replaceAll("[^a-zA-Z0-9_.]+", "");
    }

    /**
     * Main method for testing
     * @param args Command line arguments
     */
    public static void main(String[] args) {

        // Sample input to sanitize
        String badInput = "SELECT '1'; DELETE FROM DB.TEST_TABLE;";

        // Clean the input
        String cleanedInput = sanitize(badInput);

        // Display the cleaned input
        System.out.println(cleanedInput);
    }
}
