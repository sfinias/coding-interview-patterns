package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class MinSizeSubArraySumTest {

    @Test
    void testFindMinSubArray() {

        assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 3, 2}));
        assertEquals(1, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 8}));
        assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[] {3, 4, 1, 1, 6}));

        assertEquals(2, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 3, 2}));
        assertEquals(1, MinSizeSubArraySum.findMinSubArray(7, new int[] {2, 1, 5, 2, 8}));
        assertEquals(3, MinSizeSubArraySum.findMinSubArray(8, new int[] {3, 4, 1, 1, 6}));
    }
}