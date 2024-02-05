package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringPermutationsTest {

    @Test
    void test() {
        assertTrue(StringPermutations.findPermutation("oidbcaf", "abc"));
        assertFalse(StringPermutations.findPermutation("odicf", "dc"));
        assertTrue(StringPermutations.findPermutation("bcdxabcdy", "bcdyabcdx"));
        assertTrue(StringPermutations.findPermutation("aaacb", "abc"));
    }
}