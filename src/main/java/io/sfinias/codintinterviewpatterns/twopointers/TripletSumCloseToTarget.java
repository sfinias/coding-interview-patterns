package io.sfinias.codintinterviewpatterns.twopointers;

import java.util.Arrays;

public class TripletSumCloseToTarget {

    public static int searchTriplet(int[] arr, int targetSum) {

        Integer closestSum = null;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int left = i + 1, right = arr.length - 1;
            while (left < right) {
                int sum = arr[i] + arr[left] + arr[right];
                if (closestSum == null || (Math.abs(targetSum - sum) < Math.abs(targetSum - closestSum))
                        || (Math.abs(targetSum - sum) == Math.abs(targetSum - closestSum) && sum < closestSum)) {
                    closestSum = sum;
                }
                if (sum > targetSum) {
                    right--;
                } else if (sum < targetSum) {
                    left++;
                } else {
                    return sum;
                }
            }
        }
        return closestSum != null ? closestSum : 0;
    }

    // Time Complexity O(N^2)
    // Space Complexity O(N)
}
