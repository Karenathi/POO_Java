package com.junit;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class Intervaltest {
    @Test
    public void testSumIntervals() {
        int[][] intervals1 = {{1, 5}};
        int result1 = Interval.sumIntervals(intervals1);
        assertEquals(4, result1);

        int[][] intervals2 = {{1, 4}, {7, 10}, {3, 5}};
        int result2 = Interval.sumIntervals(intervals2);
        assertEquals(7, result2);
    }
    @Test
    public void testNonOverlappingIntervals() {
        int[][] interval2 = {{1, 3}, {5, 7}, {9, 11}};
        int result = Interval.sumIntervals(interval2);
        assertEquals(6, result);
    }

    @Test
    public void testNested(){
        int[][] interval3 = {{1, 10}, {2, 6}, {7, 9}};
        int result = Interval.sumIntervals(interval3);
        assertEquals(9,result);
    }

    @Test
    public void testEmptyIntervals(){
        int[][] interval4 = {};
        int result = Interval.sumIntervals(interval4);
        assertEquals(0,result);
    }
    @Test
    public void testNullIntervals(){
        int[][] interval5 = null;
        int result = Interval.sumIntervals(interval5);
        assertEquals(0,result);
    }
    @Test
    public void testSameEndpointsIntervals(){
        int[][] interval6 = {{1, 1}, {3, 3}, {5, 5}};
        int result = Interval.sumIntervals((interval6));
        assertEquals(0,result);
    }
}


