package io.sfinias.codintinterviewpatterns.slidingwindow;

import java.util.HashMap;
import java.util.Map;

/*
Given a string, find the length of the longest substring in it with no more than K distinct characters.

Example 1:

Input: String="araaci", K=2
Output: 4
Explanation: The longest substring with no more than '2' distinct characters is "araa".

Example 2:

Input: String="araaci", K=1
Output: 2
Explanation: The longest substring with no more than '1' distinct characters is "aa".

Example 3:

Input: String="cbbebi", K=3
Output: 5
Explanation: The longest substrings with no more than '3' distinct characters are "cbbeb" & "bbebi".
 */
public class LongestSubstringKDistinct {

    public static int findLength(String str, int k) {

        Map<Character, Integer> map = new HashMap<>();
        char[] arr = str.toCharArray();
        int longestSubstringLength = 0;
        int start = 0;
        for (int end = 0; end < arr.length; end++) {
            char c = arr[end];
            map.compute(c, (key, value) -> value == null ? 1 : value + 1);
            while (map.size() > k) {
                c = arr[start];
                map.compute(c, (key, value) -> value == 1 ? null : value - 1);
                start++;
            }
            longestSubstringLength = Math.max(longestSubstringLength, end - start + 1);
        }
        return longestSubstringLength;
    }

    // Time Complexity O(N)
    // Space Complexity O(K)

}
