//Roman numerals are represented by seven different symbols: I, V, X, L, C, D and M.
//
//    Symbol       Value
//    I             1
//    V             5
//    X             10
//    L             50
//    C             100
//    D             500
//    M             1000
//
//For example, 2 is written as II in Roman numeral, just two ones added together. 12 is written as XII, which is simply X + II. The number 27 is written as XXVII, which is XX + V + II.
//
//Roman numerals are usually written largest to smallest from left to right. However, the numeral for four is not IIII. Instead, the number four is written as IV. Because the one is before the five we subtract it making four. The same principle applies to the number nine, which is written as IX. There are six instances where subtraction is used:
//
//    I can be placed before V (5) and X (10) to make 4 and 9.
//    X can be placed before L (50) and C (100) to make 40 and 90.
//    C can be placed before D (500) and M (1000) to make 400 and 900.
//
//Given a roman numeral, convert it to an integer.
//
//Constraints:
//
//1 <= s.length <= 15
//s contains only the characters ('I', 'V', 'X', 'L', 'C', 'D', 'M').
//It is guaranteed that s is a valid roman numeral in the range [1, 3999].

package org.training.Java.easy;

public class RomanToInteger {
    public int romanToInt(String s) {
        int result = 0;
        char[] arr = s.toCharArray();
        int lastIndex = arr.length - 1;
        for (int i = 0; i <= lastIndex; i++) {
            result += switch (arr[i]) {
                case 'I' -> {
                    if (i != lastIndex && (arr[i + 1] == 'V' || arr[i + 1] == 'X')) {
                        yield -1;
                    } else {
                        yield 1;
                    }
                }
                case 'V' -> 5;
                case 'X' -> {
                    if (i != lastIndex && (arr[i + 1] == 'L' || arr[i + 1] == 'C')) {
                        yield -10;
                    } else {
                        yield 10;
                    }
                }
                case 'L' -> 50;
                case 'C' -> {
                    if (i != lastIndex && (arr[i + 1] == 'D' || arr[i + 1] == 'M')) {
                        yield -100;
                    } else {
                        yield 100;
                    }
                }
                case 'D' -> 500;
                case 'M' -> 1000;
                default -> 0;
            };
        }
        return result;
    }
}
