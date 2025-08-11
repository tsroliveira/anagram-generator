package com.example.anagram;

import java.util.ArrayList;
import java.util.List;

public final class AnagramGenerator {

    private AnagramGenerator() { }

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
