package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class SubarrayProductLessThanKTest {

    @Test
    void test() {

        assertEquals(List.of(List.of(2), List.of(5), List.of(2, 5), List.of(3), List.of(5, 3), List.of(10))
                , SubarrayProductLessThanK.findSubarrays(new int[]{2, 5, 3, 10}, 30) );

        assertEquals(List.of(List.of(8), List.of(2), List.of(8, 2), List.of(6), List.of(2, 6), List.of(5), List.of(6,5))
                , SubarrayProductLessThanK.findSubarrays(new int[]{8, 2, 6, 5}, 50) );

    }
}