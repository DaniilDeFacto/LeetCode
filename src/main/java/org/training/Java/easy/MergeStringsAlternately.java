//You are given two strings word1 and word2. Merge the strings by adding letters in alternating order, starting with word1. If a string is longer than the other, append the additional letters onto the end of the merged string.
//
//Return the merged string.
//
//Constraints:
//
//1 <= word1.length, word2.length <= 100
//word1 and word2 consist of lowercase English letters.

package org.training.Java.easy;

public class MergeStringsAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        char[] chars1 = word1.toCharArray();
        char[] chars2= word2.toCharArray();
        int i = 0;
        while (i < Math.min(word1.length(), word2.length())) {
            result.append(chars1[i]);
            result.append(chars2[i]);
            i++;
        }
        if (word1.length() > word2.length()) {
            result.append(word1.substring(i));
        } else if (word1.length() < word2.length()) {
            result.append(word2.substring(i));
        }
        return result.toString();
    }
}
