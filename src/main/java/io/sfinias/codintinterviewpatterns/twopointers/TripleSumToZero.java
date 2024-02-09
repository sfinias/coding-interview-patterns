package io.sfinias.codintinterviewpatterns.twopointers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Given an array of unsorted numbers, find all unique triplets in it that add up to zero.

Example 1:

Input: [-3, 0, 1, 2, -1, 1, -2]
Output: [-3, 1, 2], [-2, 0, 2], [-2, 1, 1], [-1, 0, 1]
Explanation: There are four unique triplets whose sum is equal to zero.

Example 2:

Input: [-5, 2, -1, -2, 3]
Output: [[-5, 2, 3], [-2, -1, 3]]
Explanation: There are two unique triplets whose sum is equal to zero.
 */
public class TripleSumToZero {

    public static List<List<Integer>> searchTriplets(int[] arr) {

        Arrays.sort(arr);
        List<List<Integer>> triplets = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            if (arr[i] == arr[i + 1]) continue;
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                int sum = arr[left] + arr[right] + arr[i];
                if (sum > 0) {
                    right--;
                } else if (sum < 0) {
                    left++;
                } else {
                    triplets.add(List.of(arr[i], arr[left], arr[right]));
                    left++;
                    right--;
                    while (left < right && arr[left] == arr[left - 1]) left++;
                    while (left < right && arr[right] == arr[right + 1]) right++;
                }
            }
        }
        return triplets;
    }

    // Time Complexity O(N^2)
    // Space Complexity O(N) (for sorting)

}
