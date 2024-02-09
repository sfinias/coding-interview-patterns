package io.sfinias.codintinterviewpatterns.twopointers;


/*
Given a sorted array, create a new array containing squares of all the number of the input array in the sorted order.

Example 1:

Input: [-2, -1, 0, 2, 3]
Output: [0, 1, 4, 4, 9]

Example 2:

Input: [-3, -1, 0, 1, 2]
Output: [0 1 1 4 9]
 */
public class SortedArraySquares {

    public static int[] makeSquares(int[] arr) {

        int[] squares = new int[arr.length];
        int left = 0, right = arr.length - 1, index = arr.length - 1;
        while (left <= right) {
            int leftSquared = (int) Math.pow(arr[left], 2);
            int rightSquared = (int) Math.pow(arr[right], 2);
            if (leftSquared > rightSquared) {
                squares[index] = leftSquared;
                left++;
            } else {
                squares[index] = rightSquared;
                right--;
            }
            index--;
        }
        return squares;
    }

    // Time Complexity O(N)
    // Space Complexity O(N)

}
