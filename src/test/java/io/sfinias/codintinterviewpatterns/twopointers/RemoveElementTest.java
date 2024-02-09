package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class RemoveElementTest {

    @Test
    void test() {

        assertEquals(4, RemoveElement.remove(new int[]{3, 2, 3, 6, 3, 10, 9, 3}, 3));
        assertEquals(2, RemoveElement.remove(new int[]{2, 11, 2, 2, 1}, 2));

    }
}