package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NoRepeatSubstringTest {

    @Test
    void test() {
        assertEquals(3, NoRepeatSubstring.findLength("aabccbb"));
        assertEquals(2, NoRepeatSubstring.findLength("abbbb"));
        assertEquals(3, NoRepeatSubstring.findLength("abccde"));
    }
}