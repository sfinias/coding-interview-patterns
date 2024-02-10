package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ShortestWindowSortTest {

    @Test
    void test() {
        assertEquals(5, ShortestWindowSort.sort(new int[]{1, 2, 5, 3, 7, 10, 9, 12}));
        assertEquals(5, ShortestWindowSort.sort(new int[]{1, 3, 2, 0, -1, 7, 10}));
        assertEquals(0, ShortestWindowSort.sort(new int[]{1, 2, 3}));
        assertEquals(3, ShortestWindowSort.sort(new int[]{3, 2, 1}));
    }
}