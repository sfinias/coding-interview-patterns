package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MinimumWindowSubstringTest {

    @Test
    void test() {

        assertEquals("abdec", MinimumWindowSubstring.findSubstring("aabdec", "abc"));
        assertEquals("abc", MinimumWindowSubstring.findSubstring("abdabca", "abc"));
        assertEquals("", MinimumWindowSubstring.findSubstring("adcad", "abc"));
        assertEquals("abbbc", MinimumWindowSubstring.findSubstring("aaabbbccc", "abc"));
    }
}