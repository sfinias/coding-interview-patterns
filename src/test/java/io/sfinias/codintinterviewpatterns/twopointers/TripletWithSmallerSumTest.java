package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TripletWithSmallerSumTest {

    @Test
    void test() {

        assertEquals(2, TripletWithSmallerSum.searchTriplets(new int[]{-1, 0, 2, 3}, 3));
        assertEquals(4, TripletWithSmallerSum.searchTriplets(new int[]{-1, 4, 2, 1, 3}, 5));
    }
}