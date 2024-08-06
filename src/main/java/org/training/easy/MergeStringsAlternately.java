package org.training.easy;

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
