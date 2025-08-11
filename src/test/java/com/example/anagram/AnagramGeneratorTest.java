package com.example.anagram;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class AnagramGeneratorTest {

    @Test
    void testAnagram3Letters() {
        List<String> result = AnagramGenerator.generateAnagrams("abc");
        assertEquals(6, result.size(), "abc should yield 6 permutations");
        assertTrue(result.contains("abc"));
        assertTrue(result.contains("acb"));
        assertTrue(result.contains("bac"));
        assertTrue(result.contains("bca"));
        assertTrue(result.contains("cab"));
        assertTrue(result.contains("cba"));
    }

    @Test
    void testSingleLetter() {
        List<String> result = AnagramGenerator.generateAnagrams("a");
        assertEquals(1, result.size());
        assertEquals("a", result.get(0));
    }

    @Test
    void testEmptyInput() {
        List<String> result = AnagramGenerator.generateAnagrams("");
        assertTrue(result.isEmpty());
    }

    @Test
    void testInvalidCharacters() {
        List<String> result = AnagramGenerator.generateAnagrams("ab1");
        assertTrue(result.isEmpty());
    }
}
