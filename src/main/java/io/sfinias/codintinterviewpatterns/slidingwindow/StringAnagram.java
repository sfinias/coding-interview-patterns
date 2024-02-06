package io.sfinias.codintinterviewpatterns.slidingwindow;

/*
Given a string and a pattern, find all anagrams of the pattern in the given string.

Anagram is actually a Permutation of a string. For example, “abc” has the following six anagrams:

    abc
    acb
    bac
    bca
    cab
    cba

Write a function to return a list of starting indices of the anagrams of the pattern in the given string.

Example 1:

Input: String="ppqp", Pattern="pq"
Output: [1, 2]
Explanation: The two anagrams of the pattern in the given string are "pq" and "qp".

Example 2:

Input: String="abbcabc", Pattern="abc"
Output: [2, 3, 4]
Explanation: The three anagrams of the pattern in the given string are "bca", "cab", and "abc".
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StringAnagram {

    public static List<Integer> findStringAnagram(String str, String pattern) {

        List<Integer> result = new ArrayList<>();
        Map<Character, Integer> patternMap = new HashMap<>();
        int start = 0, matched = 0;
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            if (patternMap.containsKey(c)) {
                patternMap.put(c, patternMap.get(c) - 1);
                if (patternMap.get(c) == 0) matched++;
            }
            if (matched == patternMap.size()) {
                result.add(start);
            }
            if (end - start + 1 >= pattern.length()) {
                c = str.charAt(start);
                if (patternMap.containsKey(c)) {
                    int oldValue = patternMap.put(c, patternMap.get(c) + 1);
                    if (oldValue == 0) matched--;
                }
                start++;
            }
        }
        return result;
    }

    // Time Complexity O(N + M)
    // Space Complexity O(M)
}
