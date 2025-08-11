package com.example.anagram;

import java.util.ArrayList;
import java.util.List;

/**
 * Utility class that generates all anagrams (permutations) for a given
 * string of distinct letters.
 *
 * <p>Constraints & validation:
 * <ul>
 *   <li>Input must be non-null, non-empty and contain letters only [a-zA-Z].</li>
 *   <li>If validation fails, an empty list is returned.</li>
 * </ul>
 *
 * <p>Algorithm:
 * <br/>Backtracking/DFS that progressively builds a prefix and removes the
 * current character from the remaining pool, until no characters remain.
 * When remaining == 0, a valid permutation is added to the result list.
 */
public final class AnagramGenerator {

    private AnagramGenerator() { }

    /**
     * Generates all anagrams (permutations) from a string of distinct letters.
     *
     * @param input letters-only string (distinct characters). Example: "abc"
     * @return list of permutations; empty list if input is invalid
     */
    public static List<String> generateAnagrams(String input) {
        List<String> result = new ArrayList<>();
        if (input == null || input.isEmpty() || !input.matches("^[a-zA-Z]+$")) {
            return result;
        }
        permute("", input, result);
        return result;
    }

    private static void permute(String prefix, String remaining, List<String> out) {
        if (remaining.length() == 0) {
            out.add(prefix);
            return;
        }
        for (int i = 0; i < remaining.length(); i++) {
            permute(prefix + remaining.charAt(i),
                    remaining.substring(0, i) + remaining.substring(i + 1),
                    out);
        }
    }
}
