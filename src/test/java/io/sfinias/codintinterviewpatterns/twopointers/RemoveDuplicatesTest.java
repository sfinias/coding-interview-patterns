package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveDuplicatesTest {

    @Test
    void test() {

        assertEquals(4, RemoveDuplicates.remove(new int[]{2, 3, 3, 3, 6, 9, 9}));
        assertEquals(2, RemoveDuplicates.remove(new int[]{2, 2, 2, 11}));
    }
}