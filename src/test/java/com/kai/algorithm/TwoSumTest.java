package com.kai.algorithm;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class TwoSumTest {
    @Test
    public void twoSum() throws Exception {
        TwoSum twoSum = new TwoSum();
        int[] arr = twoSum.twoSum(new int[]{3, 2, 3}, 6);
        assertArrayEquals(new int[]{0, 2}, arr);

        arr = twoSum.twoSum(new int[]{4, 2, 1}, 4);
        assertNull(arr);

    }

}