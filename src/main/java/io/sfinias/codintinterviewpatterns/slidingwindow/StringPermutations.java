package io.sfinias.codintinterviewpatterns.slidingwindow;

/*
Given a string and a pattern, find out if the string contains any permutation of the pattern.

Permutation is defined as the re-arranging of the characters of the string. For example, “abc” has the following six permutations:

    abc
    acb
    bac
    bca
    cab
    cba

If a string has ‘n’ distinct characters it will have n!n! permutations.

Example 1:

Input: String="oidbcaf", Pattern="abc"
Output: true
Explanation: The string contains "bca" which is a permutation of the given pattern.

Example 2:

Input: String="odicf", Pattern="dc"
Output: false
Explanation: No permutation of the pattern is present in the given string as a substring.

Example 3:

Input: String="bcdxabcdy", Pattern="bcdyabcdx"
Output: true
Explanation: Both the string and the pattern are a permutation of each other.

Example 4:

Input: String="aaacb", Pattern="abc"
Output: true
Explanation: The string contains "acb" which is a permutation of the given pattern.
 */

import java.util.HashMap;
import java.util.Map;

public class StringPermutations {

    public static boolean findPermutation(String str, String pattern) {

        Map<Character, Integer> patternMap = new HashMap<>();
        Map<Character, Integer> testedMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        for (char c : str.toCharArray()) {
            if (!patternMap.containsKey(c)) {
                testedMap = new HashMap<>();
            } else if (testedMap.getOrDefault(c, 0) + 1 <= patternMap.get(c)) {
                testedMap.put(c, testedMap.getOrDefault(c, 0) + 1);
                if (testedMap.equals(patternMap)) {
                    return true;
                }
            }
        }
        return false;
    }
    // Time Complexity O(N+M)
    // Space Complexity O(N+M)

    public static boolean findLengthCourseSolution(String str, String pattern) {

        int windowStart = 0, matched = 0;
        Map<Character, Integer> charFrequencyMap = new HashMap<>();
        for (char chr : pattern.toCharArray()) {
            charFrequencyMap.put(chr, charFrequencyMap.getOrDefault(chr, 0) + 1);
        }

        // our goal is to match all the characters from the 'charFrequencyMap' with the current window
        // try to extend the range (windowStart, windowEnd)
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightCHar = str.charAt(windowEnd);
            if (charFrequencyMap.containsKey(rightCHar)) {
                // decrement the frequency of the matched character
                charFrequencyMap.put(rightCHar, charFrequencyMap.get(rightCHar) - 1);
                if (charFrequencyMap.get(rightCHar) == 0) { // character is completely matched
                    matched++;
                }
            }
            if (matched == charFrequencyMap.size()) {
                return true;
            }

            if (windowEnd >= pattern.length() - 1) { // shrink the window by one character
                char leftChar = str.charAt(windowStart++);
                if (charFrequencyMap.containsKey(leftChar)) {
                    if (charFrequencyMap.get(leftChar) == 0) {
                        matched--;
                    }
                    charFrequencyMap.put(leftChar, charFrequencyMap.get(leftChar) + 1);
                }
            }
        }
        return false;
    }
    // Time Complexity O(N+M)
    // Space Complexity O(M)
}
