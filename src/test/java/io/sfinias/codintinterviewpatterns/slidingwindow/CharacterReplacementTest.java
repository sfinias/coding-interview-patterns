package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CharacterReplacementTest {

    @Test
    void test() {
        assertEquals(5, CharacterReplacement.findLength("aabccbb", 2));
        assertEquals(4, CharacterReplacement.findLength("abbcb", 1));
        assertEquals(3, CharacterReplacement.findLength("abccde", 1));
    }
}