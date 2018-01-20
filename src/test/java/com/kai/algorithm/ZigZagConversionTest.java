package com.kai.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class ZigZagConversionTest {
    @Test
    public void convert() throws Exception {
        String s = ZigZagConversion.convert("A", 2);
        assertEquals("A", s);

        s = ZigZagConversion.convert("PAYPALISHIRING", 3);
        assertEquals("PAHNAPLSIIGYIR", s);

        s = ZigZagConversion.convert("", 2);
        assertEquals("", s);
    }

}