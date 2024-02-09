package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class TripleSumToZeroTest {

    @Test
    void test() {

        assertEquals(List.of(List.of(-3, 1, 2), List.of(-2, 0, 2), List.of(-2, 1, 1), List.of(-1, 0, 1)),
                TripleSumToZero.searchTriplets(new int[]{-3, 0, 1, 2, -1, 1, -2}));
        assertEquals(List.of(List.of(-5, 2, 3), List.of(-2, -1, 3)),
                TripleSumToZero.searchTriplets(new int[]{-5, 2, -1, -2, 3}));

    }
}