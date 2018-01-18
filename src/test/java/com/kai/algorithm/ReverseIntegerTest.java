package com.kai.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ReverseIntegerTest {
    @Test
    public void reverse2() throws Exception {
        ReverseInteger reverseInteger = new ReverseInteger();
        int j = reverseInteger.reverse2(122);
        assertEquals(221, j);

        j = reverseInteger.reverse2(-122);
        assertEquals(-221, j);

        j = reverseInteger.reverse2(12200100);
        assertEquals(100221, j);

        j = reverseInteger.reverse2(-12200100);
        assertEquals(-100221, j);

        j = reverseInteger.reverse2(1534236469);
        assertEquals(0, j);

    }

    @Test
    public void reverse() throws Exception {
        ReverseInteger reverseInteger = new ReverseInteger();
        int i = reverseInteger.reverse(122);
        assertEquals(221, i);

        i = reverseInteger.reverse(-122);
        assertEquals(-221, i);

        i = reverseInteger.reverse(12200100);
        assertEquals(100221, i);

        i = reverseInteger.reverse(-12200100);
        assertEquals(-100221, i);

        i = reverseInteger.reverse(1534236469);
        assertEquals(0, i);
    }



}