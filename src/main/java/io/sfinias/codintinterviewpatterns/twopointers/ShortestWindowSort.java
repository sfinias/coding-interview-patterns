package io.sfinias.codintinterviewpatterns.twopointers;

/*
Given an array, find the length of the smallest subarray in it which when sorted will sort the whole array.

Example 1:

Input: [1, 2, 5, 3, 7, 10, 9, 12]
Output: 5
Explanation: We need to sort only the subarray [5, 3, 7, 10, 9] to make the whole array sorted

Example 2:

Input: [1, 3, 2, 0, -1, 7, 10]
Output: 5
Explanation: We need to sort only the subarray [1, 3, 2, 0, -1] to make the whole array sorted

Example 3:

Input: [1, 2, 3]
Output: 0
Explanation: The array is already sorted

Example 4:

Input: [3, 2, 1]
Output: 3
Explanation: The whole array needs to be sorted.
 */
public class ShortestWindowSort {

    public static int sort(int[] arr) {

        int leftestSort = Integer.MAX_VALUE;
        int rightestSort = Integer.MIN_VALUE;

        int left = 0;
        while (left < arr.length - 1) {
            for (int i = left + 1; i < arr.length; i++) {
                if (arr[left] > arr[i]) {
                    leftestSort = Math.min(leftestSort, left);
                    rightestSort = Math.max(rightestSort, i);
                }
            }
            left++;
        }
        int right = arr.length - 1;
        while (right > 0) {
            for (int i = right - 1; i >= 0; i--) {
                if (arr[right] < arr[i]) {
                    leftestSort = Math.min(leftestSort, i);
                    rightestSort = Math.max(rightestSort, right);
                }
            }
            right--;
        }
        return leftestSort < rightestSort ? rightestSort - leftestSort + 1 : 0;
    }

    public static int sortFromCourse(int[] arr) {

        int low = 0, high = arr.length - 1;
        // find the first number out of sorting order from the beginning
        while (low < arr.length - 1 && arr[low] <= arr[low + 1]) low++;

        if (low == arr.length - 1) return 0; // if the array is sorted

        //find the first number out of sorting order from the end
        while (high > 0 && arr[high] >= arr[high - 1]) high--;

        // find the maximum and minimum of the subarray
        int subarrayMax = Integer.MIN_VALUE, subarrayMin = Integer.MAX_VALUE;
        for (int k = low; k <= high; k++) {
            subarrayMax = Math.max(subarrayMax, arr[k]);
            subarrayMin = Math.min(subarrayMin, arr[k]);
        }

        // extend the subarray to include any number which is bigger than the minimum of the subarray
        while (low > 0 && arr[low - 1] > subarrayMin) low--;

        // extend the subarray to include any number which is smaller than the maximum of the subarray
        while (high < arr.length - 1 && arr[high] < subarrayMax) high++;

        return high - low + 1;
    }

    // Time Complexity O(N)
    // Space Complexity O(1)
}
