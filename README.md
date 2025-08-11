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

# Compile and generate the jar
mvn package

# Start Test
mvn test

# Run the mains class jar generated
java -jar target/anagram-generator-1.0.0.jar
