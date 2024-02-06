package io.sfinias.codintinterviewpatterns.slidingwindow;

/*


Given a string and a pattern, find the smallest substring in the given string which has all the characters of the given pattern.

Example 1:

Input: String="aabdec", Pattern="abc"
Output: "abdec"
Explanation: The smallest substring having all characters of the pattern is "abdec"

Example 2:

Input: String="abdabca", Pattern="abc"
Output: "abc"
Explanation: The smallest substring having all characters of the pattern is "abc".

Example 3:

Input: String="adcad", Pattern="abc"
Output: ""
Explanation: No substring in the given string has all characters of the pattern.
 */

import java.util.HashMap;
import java.util.Map;

public class MinimumWindowSubstring {

    public static String findSubstring(String str, String pattern) {

        Map<Character, Integer> patternMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            patternMap.put(c, patternMap.getOrDefault(c, 0) + 1);
        }
        int start = 0, matched = 0, minimumLength = Integer.MAX_VALUE, resultStart = 0;
        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            if (patternMap.containsKey(c)) {
                patternMap.put(c, patternMap.get(c) - 1);
                if (patternMap.get(c) >= 0) matched++;
            }
            while (matched == pattern.length()) {
                if (minimumLength > end - start + 1) {
                    minimumLength = end - start + 1;
                    resultStart = start;
                }
                c = str.charAt(start);
                if (patternMap.containsKey(c)) {
                    if (patternMap.get(c) == 0) {
                        matched--;
                    }
                    patternMap.put(c, patternMap.get(c) + 1);
                }
                start++;
            }
        }
        return (minimumLength == Integer.MAX_VALUE) ? "" : str.substring(resultStart, resultStart + minimumLength);
    }

}
