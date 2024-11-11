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
