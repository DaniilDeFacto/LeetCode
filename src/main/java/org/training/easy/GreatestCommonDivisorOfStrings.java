package org.training.easy;

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
