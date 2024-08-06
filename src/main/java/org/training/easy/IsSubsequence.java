package org.training.easy;

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
