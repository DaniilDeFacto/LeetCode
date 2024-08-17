package org.training.Java.easy;

public class CanPlaceFlowers {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        for (var i = 0; i < flowerbed.length && n > 0; i++) {
            if (flowerbed[i] == 0) {
                boolean prev = i == 0 || flowerbed[i - 1] == 0;
                boolean next = i == flowerbed.length - 1 || flowerbed[i + 1] == 0;
                if (prev && next) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }
        return n == 0;
    }
}
