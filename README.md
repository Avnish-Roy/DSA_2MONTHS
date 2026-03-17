# Competitive Programming Solutions

A Java-based collection of competitive programming solutions organized by problem categories.

## Project Structure

```
untitled/
├── pom.xml                          # Maven configuration
├── README.md                        # This file
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── org/example/
│   │   │       ├── Main.java       # Entry point
│   │   │       └── arrays/         # Array-related problems
│   │   │           └── TwoSum.java # LeetCode #1: Two Sum
│   │   └── resources/
│   └── test/
│       └── java/                   # Unit tests
└── target/                          # Compiled classes and artifacts
```

## Problems Solved

### Arrays

#### TwoSum (LeetCode #1)
Find two numbers in an array that add up to a specific target and return their indices.

**Approaches Implemented:**

1. **Brute Force** (`twoSum`)
   - Time Complexity: O(n²)
   - Space Complexity: O(1)
   - Description: Nested loop checking all pairs

2. **HashMap** (`twoSumHashMap`)
   - Time Complexity: O(n)
   - Space Complexity: O(n)
   - Description: Single pass using hash map for complement lookup

3. **Two Pointer** (`twoSumTwoPointer`)
   - Time Complexity: O(n log n) if sorted first, O(n) if already sorted
   - Space Complexity: O(1)
   - Description: Works on sorted arrays with pointers from both ends

## Prerequisites

- Java 8 or higher
- Maven 3.6+

## Setup & Build

1. **Build the project:**
   ```bash
   mvn clean compile
   ```

2. **Run the main application:**
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.Main"
   ```

3. **Run TwoSum solution:**
   ```bash
   mvn exec:java -Dexec.mainClass="org.example.arrays.TwoSum"
   ```

4. **Run tests:**
   ```bash
   mvn test
   ```

## Adding New Solutions

1. Create a new Java file in the appropriate category folder under `src/main/java/org/example/`
2. Implement your solution with clear comments
3. Update this README with the new problem entry
4. Add corresponding unit tests in `src/test/java/`

## Solution Template

```java
package org.example.<category>;

/**
 * Problem: <Problem Name> (LeetCode/HackerRank #<Number>)
 * Time Complexity: O(?)
 * Space Complexity: O(?)
 */
public class <ClassName> {
    // Solution implementation
}
```

## How to Contribute

- Add solutions in organized category folders
- Include time and space complexity analysis
- Write clean, readable code with comments
- Add test cases for validation

---

*Last Updated: March 17, 2026*

