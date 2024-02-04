package io.sfinias.codintinterviewpatterns.slidingwindow;

public class MaxSubarrayOfSizeK {

//Given an array of positive numbers and a positive number ‘k’, find the maximum sum of any contiguous subarray of size ‘k’.
//
//Example 1:
//
//Input: [2, 1, 5, 1, 3, 2], k=3
//Output: 9
//Explanation: Subarray with maximum sum is [5, 1, 3].
//
//Example 2:
//
//Input: [2, 3, 4, 1, 5], k=2
//Output: 7
//Explanation: Subarray with maximum sum is [3, 4].

    public static int findMaxSumSubArray(int k, int[] arr) {

        int max = 0;
        int sum = 0;
        int windowStart = 0;
        for (int windowEnd = 0; windowEnd < arr.length; windowEnd++) {
            sum += arr[windowEnd];
            if (windowEnd - windowStart == k) {
                sum -= arr[windowStart];
                windowStart++;
                if (max < sum) {
                    max = sum;
                }
            }
        }
        return max;
    }

    //Time Complexity O(N)
    //Space Complexity O(1)

}
