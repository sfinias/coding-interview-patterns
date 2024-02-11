package io.sfinias.codintinterviewpatterns.fastslowpointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class HappyNumberTest {

    @Test
    void test() {

        assertTrue(HappyNumber.find(23));
        assertFalse(HappyNumber.find(12));
    }
}