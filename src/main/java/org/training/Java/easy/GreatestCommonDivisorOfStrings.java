//For two strings s and t, we say "t divides s" if and only if s = t + t + t + ... + t + t (i.e., t is concatenated with itself one or more times).
//
//Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
//
//Constraints:
//
//1 <= str1.length, str2.length <= 1000
//str1 and str2 consist of English uppercase letters.

package org.training.Java.easy;

public class GreatestCommonDivisorOfStrings {
    public String gcdOfStrings(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        int gcd = gcd(len1,len2);
        String result = str1.substring(0, gcd);
        if (!str1.equals(result.repeat(len1 / gcd))) {
            return "";
        } else if (!str2.equals(result.repeat(len2 / gcd))) {
            return "";
        } else {
            return result;
        }
    }

    public int gcd(int len1, int len2) {
        for (var i = Math.min(len1, len2); i >= 1; i--) {
            if (len1 % i == 0 && len2 % i == 0) {
                return i;
            }
        }
        return 1;
    }
}
