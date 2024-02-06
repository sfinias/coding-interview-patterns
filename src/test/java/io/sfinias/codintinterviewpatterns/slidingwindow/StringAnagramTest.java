package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class StringAnagramTest {

    @Test
    void test() {
        assertEquals(List.of(1, 2), StringAnagram.findStringAnagram("ppqp", "pq"));
        assertEquals(List.of(2, 3 ,4), StringAnagram.findStringAnagram("abbcabc", "abc"));
    }
}