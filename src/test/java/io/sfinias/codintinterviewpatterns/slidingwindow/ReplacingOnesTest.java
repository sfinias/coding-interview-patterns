package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ReplacingOnesTest {

    @Test
    void test() {
        assertEquals(6, ReplacingOnes.findLength(new int[]{0, 1, 1, 0, 0, 0, 1, 1, 0, 1, 1}, 2));
        assertEquals(9, ReplacingOnes.findLength(new int[]{0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 1, 1}, 3));
    }
}