package org.training.easy;

public class FindTheHighestAltitude {
    public int largestAltitude(int[] gain) {
        int height = 0;
        int maxHeight = height;
        for (int altitudeGain : gain) {
            height += altitudeGain;
            maxHeight = Math.max(maxHeight, height);
        }
        return maxHeight;
    }
}
