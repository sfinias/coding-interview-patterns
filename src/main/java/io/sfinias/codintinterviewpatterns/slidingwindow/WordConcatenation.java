package io.sfinias.codintinterviewpatterns.slidingwindow;

/*
Given a string and a list of words, find all the starting indices of substrings in the given string that are a concatenation of all the given words exactly once without any overlapping of words. It is given that all words are of the same length.

Example 1:

Input: String="catfoxcat", Words=["cat", "fox"]
Output: [0, 3]
Explanation: The two substring containing both the words are "catfox" & "foxcat".

Example 2:

Input: String="catcatfoxfox", Words=["cat", "fox"]
Output: [3]
Explanation: The only substring containing both the words is "catfox".
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class WordConcatenation {

    public static List<Integer> findWordConcatenation(String str, String[] words) {

        List<Integer> result = new ArrayList<>();
        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            wordsMap.put(word, wordsMap.getOrDefault(word, 0) + 1);
        }
        int wordCount = words.length, wordLength = words[0].length();
        for (int i = 0; i < str.length() - wordCount * wordLength + 1; i++) {
            Map<String, Integer> seenWords = new HashMap<>();
            for (int j = 0; j < wordCount; j++) {
                int wordIndex = i + j * wordLength;
                String word = str.substring(wordIndex, wordIndex + wordLength);
                if (!wordsMap.containsKey(word)) break;

                seenWords.put(word, seenWords.getOrDefault(word, 0) + 1);
                if (seenWords.get(word) > wordsMap.get(word)) break;
                if (j == wordCount - 1) result.add(i);
            }

        }
        return result;
    }


}
