package io.sfinias.codintinterviewpatterns.slidingwindow;

/*
Given an array containing 0s and 1s, if you are allowed to replace no more than ‘k’ 0s with 1s, find the length of the longest contiguous subarray having all 1s.

Example 1:

Input: Array=[0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1], k=2
Output: 6
Explanation: Replace the '0' at index 5 and 8 to have the longest contiguous subarray of 1s having length 6.

Example 2:

Input: Array=[0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1], k=3
Output: 9
Explanation: Replace the '0' at index 6, 9, and 10 to have the longest contiguous subarray of 1s having length 9.
 */

public class ReplacingOnes {

    public static int findLength(int[] arr, int k) {

        int maxLength = 0, start = 0, zeroes = 0;
        for (int end = 0; end < arr.length; end++) {
            int digit = arr[end];
            if (digit == 0) zeroes++;
            while (zeroes > k) {
                digit = arr[start];
                if (digit == 0 ) zeroes--;
                start++;
            }
            maxLength = Math.max(maxLength, end - start + 1);
        }
        return maxLength;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
}
