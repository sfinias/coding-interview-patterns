package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

class PairWithTargetSumTest {

    @Test
    void test() {
        assertArrayEquals(new int[]{1, 3}, PairWithTargetSum.search(new int[]{1, 2, 3, 4, 6}, 6));
        assertArrayEquals(new int[]{0, 2}, PairWithTargetSum.search(new int[]{2, 5, 9, 11}, 11));
    }
}