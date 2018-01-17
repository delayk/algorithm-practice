package com.kai.algorithm;

import org.junit.Test;

import static org.junit.Assert.*;

public class MagicCoinTest {
    @Test
    public void calculate() throws Exception {
        String s = MagicCoin.calculate(1L);
        assertEquals("1", s);

        s = MagicCoin.calculate(2L);
        assertEquals("2", s);

        s = MagicCoin.calculate(10L);
        assertEquals("122", s);

        s = MagicCoin.calculate(1000L);
        assertEquals("222212112", s);

    }

}