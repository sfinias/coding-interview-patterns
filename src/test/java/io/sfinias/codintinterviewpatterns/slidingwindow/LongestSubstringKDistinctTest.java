package io.sfinias.codintinterviewpatterns.slidingwindow;

import static io.sfinias.codintinterviewpatterns.slidingwindow.LongestSubstringKDistinct.findLength;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class LongestSubstringKDistinctTest {

    @Test
    void testFindLength() {

        assertEquals(4, findLength("araaci", 2));
        assertEquals(2, findLength("araaci", 1));
        assertEquals(5, findLength("cbbebi", 3));


    }
}