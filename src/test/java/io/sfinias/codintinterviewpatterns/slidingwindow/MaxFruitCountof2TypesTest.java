package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MaxFruitCountof2TypesTest {

    @Test
    void test() {
        assertEquals(3, MaxFruitCountof2Types.findLength(new char[]{'A', 'B', 'C', 'A', 'C'}));
        assertEquals(5, MaxFruitCountof2Types.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));


        assertEquals(5, MaxFruitCountof2Types.findLength(new char[]{'A', 'B', 'C', 'B', 'B', 'C'}));

    }
}