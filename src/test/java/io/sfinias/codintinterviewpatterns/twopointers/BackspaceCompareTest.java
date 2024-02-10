package io.sfinias.codintinterviewpatterns.twopointers;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BackspaceCompareTest {

    @Test
    void test() {

        assertTrue(BackspaceCompare.compare("xy#z", "xzz#"));
        assertTrue(BackspaceCompare.compare("xp#", "xyz##"));
        assertTrue(BackspaceCompare.compare("xywrrmp", "xywrrmu#p"));
        assertFalse(BackspaceCompare.compare("xy#z", "xyz#"));
    }
}