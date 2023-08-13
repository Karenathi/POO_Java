package com.junit;

import java.util.Arrays;

public class Interval {
    public static int sumIntervals(int[][] intervals) {
        if (intervals == null || intervals.length == 0) {
            return 0;
        }

        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int totalLength = 0;
        int currentStart = intervals[0][0];
        int currentEnd = intervals[0][1];

        for (int i = 1; i < intervals.length; i++) {
            if (intervals[i][0] <= currentEnd) {
                currentEnd = Math.max(currentEnd, intervals[i][1]);
            } else {
                totalLength += currentEnd - currentStart;
                currentStart = intervals[i][0];
                currentEnd = intervals[i][1];
            }
        }

        totalLength += currentEnd - currentStart;

        return totalLength;
    }
}
