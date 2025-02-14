//Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
//
//A subsequence of a string is a new string that is formed from the original string by deleting some (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).
//
//Constraints:
//
//0 <= s.length <= 100
//0 <= t.length <= 10^4
//s and t consist only of lowercase English letters.

package org.training.Java.easy;

public class IsSubsequence {
    public boolean isSubsequence(String s, String t) {
        int lastIndex = 0;
        for (var letter : s.toCharArray()) {
            int newIndex = t.indexOf(letter, lastIndex);
            if (newIndex < lastIndex) {
                return false;
            } else {
                lastIndex = newIndex + 1;
            }
        }
        return true;
    }
}
