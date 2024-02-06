package io.sfinias.codintinterviewpatterns.slidingwindow;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;
import org.junit.jupiter.api.Test;

class WordConcatenationTest {

    @Test
    void test() {
        assertEquals(List.of(0, 3), WordConcatenation.findWordConcatenation("catfoxcat", new String[]{"cat", "fox"}));
        assertEquals(List.of(3), WordConcatenation.findWordConcatenation("catcatfoxfox", new String[]{"cat", "fox"}));
    }
}