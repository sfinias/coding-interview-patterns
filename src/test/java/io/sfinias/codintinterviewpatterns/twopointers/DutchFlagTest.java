package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class DutchFlagTest {

    @Test
    void test() {

        int[] actual = new int[] {1, 0, 2, 1, 0};
        DutchFlag.sort(actual);
        assertArrayEquals(new int[] {0, 0, 1, 1, 2}, actual);

        int[] actual1 = new int[] {2, 2, 0, 1, 2, 0};
        DutchFlag.sort(actual1);
        assertArrayEquals(new int[] {0, 0, 1, 2, 2, 2}, actual1);

    }
}