# Anagram Generator (Java)

Simple, readable utility that generates all anagrams (permutations) for a string of **distinct** letters.

## Requirements covered
- Accepts any group of distinct letters (e.g. `"abc"` ⇒ 6 permutations).
- Readability & clarity: compact backtracking with documentation.
- Basic validation: non-empty and letters-only (`^[a-zA-Z]+$`), otherwise returns an empty list.
- Unit tests: JUnit 5 with at least 3 test cases, including edge cases (single letter, empty input, invalid chars).
- Code documented explaining the logic.

## How to run (Maven)
```bash
mvn -q -DskipTests package
mvn -q test
