package org.training.Java.easy;

import java.util.ArrayDeque;

public class NumberOfRecentCalls {
}

class RecentCounter {
    private final ArrayDeque<Integer> timesOfRequests;

    public RecentCounter() {
        this.timesOfRequests  = new ArrayDeque<>();
    }

    public int ping(int t) {
        timesOfRequests.addLast(t);
        while (timesOfRequests.getFirst() < t - 3000) {
            timesOfRequests.removeFirst();
        }
        return timesOfRequests.size();
    }
}
