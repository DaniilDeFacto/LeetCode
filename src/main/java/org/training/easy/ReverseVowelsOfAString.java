package org.training.easy;

public class ReverseVowelsOfAString {
    public String reverseVowels(String s) {
        String vowels = "aeiouAEIOU";
        char[] chars = s.toCharArray();
        int start = 0;
        int end = chars.length - 1;
        while (start < end) {
            while (start < end && vowels.indexOf(chars[start]) == -1) {
                start++;
            }
            while (start < end && vowels.indexOf(chars[end]) == -1) {
                end--;
            }
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }
        return String.valueOf(chars);
    }
}
