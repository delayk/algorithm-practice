package com.kai.algorithm;

public class ReverseInteger {
//    Given a 32-bit signed integer, reverse digits of an integer.
//    Example 1:
//
//    Input: 123
//    Output:  321
//    Example 2:
//
//    Input: -123
//    Output: -321
//    Example 3:
//
//    Input: 120
//    Output: 21
//    Note:
//    Assume we are dealing with an environment which could only hold integers within the 32-bit signed integer range.
//    For the purpose of this problem, assume that your function returns 0 when the reversed integer overflows.

    public int reverse(int x) {
        char[] valChars = ("" + x).toCharArray();
        int endIndex = 0;
        StringBuilder sb = new StringBuilder();
        if (valChars[0] == "-".charAt(0)) {
            endIndex = 1;
            sb.append("-");
        }

        for (int i = valChars.length - 1; i >= endIndex; i--) {
            sb.append(valChars[i]);
        }

        long tmp = Long.parseLong(sb.toString());
        if (tmp > Integer.MAX_VALUE || tmp < Integer.MIN_VALUE) {
            return 0;
        }

        return Integer.parseInt(sb.toString());
    }

    public int reverse2(int x) {
        long reverseInt = 0;
        while (x != 0) {
            reverseInt = reverseInt * 10 + x % 10;
            x = x/10;
        }
        if (reverseInt < Integer.MIN_VALUE || reverseInt > Integer.MAX_VALUE) {
            return 0;
        }
        return (int) reverseInt;
    }
}
