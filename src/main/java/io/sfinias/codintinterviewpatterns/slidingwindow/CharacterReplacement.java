package io.sfinias.codintinterviewpatterns.slidingwindow;

/*
Given a string with lowercase letters only, if you are allowed to replace no more than ‘k’ letters with any letter, find the length of the longest substring having the same letters after replacement.

Example 1:

Input: String="aabccbb", k=2
Output: 5
Explanation: Replace the two 'c' with 'b' to have a longest repeating substring "bbbbb".

Example 2:

Input: String="abbcb", k=1
Output: 4
Explanation: Replace the 'c' with 'b' to have a longest repeating substring "bbbb".

Example 3:

Input: String="abccde", k=1
Output: 3
Explanation: Replace the 'b' or 'd' with 'c' to have the longest repeating substring "ccc".
 */

import java.util.HashMap;

public class CharacterReplacement {

    public static int findLength(String str, int k) {

        var map = new HashMap<Character, Integer>();
        int start = 0, longestSubstring = 0, maxRepeatedCount = 0;
        for (int end = 0; end < str.length(); end++) {
            char c = str.charAt(end);
            map.put(c, map.getOrDefault(c, 0) + 1);
            maxRepeatedCount = Math.max(maxRepeatedCount, map.get(c));
            while (end - start + 1 - maxRepeatedCount > k) {
                c = str.charAt(start);
                map.compute(c, (key, oldValue) -> oldValue == 1 ? null : oldValue - 1);
                start++;
            }
            longestSubstring = Math.max(longestSubstring, end - start + 1);
        }
        return longestSubstring;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
}
