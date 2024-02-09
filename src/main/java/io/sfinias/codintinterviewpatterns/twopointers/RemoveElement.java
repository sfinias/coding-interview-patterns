package io.sfinias.codintinterviewpatterns.twopointers;

/*\
Given an unsorted array of numbers and a target ‘key’, remove all instances of ‘key’ in-place and return the new length of the array.

Example 1:

Input: [3, 2, 3, 6, 3, 10, 9, 3], Key=3
Output: 4
Explanation: The first four elements after removing every 'Key' will be [2, 6, 10, 9].

Example 2:

Input: [2, 11, 2, 2, 1], Key=2
Output: 2
Explanation: The first two elements after removing every 'Key' will be [11, 1].
 */
public class RemoveElement {

    public static int remove(int[] arr, int key) {

        int nextNonTarget = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != key) {
                arr[nextNonTarget] = arr[i];
                nextNonTarget++;
            }
        }
        return nextNonTarget;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
}
