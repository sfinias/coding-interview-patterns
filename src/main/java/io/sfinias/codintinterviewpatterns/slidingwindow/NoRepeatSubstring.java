package io.sfinias.codintinterviewpatterns.slidingwindow;

/*
Given a string, find the length of the longest substring which has no repeating characters.

Example 1:

Input: String="aabccbb"
Output: 3
Explanation: The longest substring without any repeating characters is "abc".

Example 2:

Input: String="abbbb"
Output: 2
Explanation: The longest substring without any repeating characters is "ab".

Example 3:

Input: String="abccde"
Output: 3
Explanation: Longest substrings without any repeating characters are "abc" & "cde".
 */

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class NoRepeatSubstring {

    public static int findLength(String str) {

        var arr = str.toCharArray();
        int start = 0, longestSubstring = 0;
        var set = new HashSet<Character>();
        for (int end = 0; end < arr.length; end++) {
            char c = arr[end];
            while (set.contains(c)) {
                char startChar = arr[start];
                set.remove(startChar);
                start++;
            }
            set.add(c);
            longestSubstring = Math.max(longestSubstring, end - start + 1);
        }
        return longestSubstring;
    }

    // Solution from the course
    public static int findLengthFromCourse(String str) {

        int windowStart = 0, maxLength = 0;
        Map<Character, Integer> charIndexMap = new HashMap<>();
        // try to extend the range [windowStart, windowEnd]
        for (int windowEnd = 0; windowEnd < str.length(); windowEnd++) {
            char rightChar = str.charAt(windowEnd);
            // if the map already contains the 'rightChar', shrink the window from the beginning so that
            // we have only once occurrence of 'rightCHar'
            if (charIndexMap.containsKey(rightChar)) {
                windowStart = Math.max(windowStart, charIndexMap.get(rightChar) + 1);
            }
            charIndexMap.put(rightChar, windowEnd);
            maxLength = Math.max(maxLength, windowEnd - windowStart + 1);
        }
        return maxLength;
    }
}
