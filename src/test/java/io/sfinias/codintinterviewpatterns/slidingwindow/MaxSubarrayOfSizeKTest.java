package io.sfinias.codintinterviewpatterns.slidingwindow;

import static io.sfinias.codintinterviewpatterns.slidingwindow.MaxSubarrayOfSizeK.findMaxSumSubArray;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MaxSubarrayOfSizeKTest {

    @Test
    void testFindMaxSumSubArray() {
        int[] testArray = new int[] {2, 1, 5, 1, 3, 2};
        assertEquals(findMaxSumSubArray(3, testArray), 9);

        testArray = new int[] {2, 3, 4, 1, 5};
        assertEquals(findMaxSumSubArray(2, testArray), 7);
    }
}