package com.kai.algorithm;

public class ZigZagConversion {
//    ZigZag Conversion
//    The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: (you may want to display this pattern in a fixed font for better legibility)
//
//    P   A   H   N
//    A P L S I I G
//    Y   I   R
//    And then read line by line: "PAHNAPLSIIGYIR"
//    Write the code that will take a string and make this conversion given a number of rows:
//
//    string convert(string text, int nRows);
//    convert("PAYPALISHIRING", 3) should return "PAHNAPLSIIGYIR".

    public static String convert(String s, int numRows) {
        if (numRows == 1) {
            return s;
        }
        char[] chars = s.toCharArray();
        int charsNumPerGroup = 2*numRows -2; //chars number per group
        int x = chars.length / charsNumPerGroup * (numRows -1) + chars.length % charsNumPerGroup;
        String[][] array = new String[x][numRows];
        int xx = 0; // row index
        int yy = 0; // column index
        for (int i = 0; i < chars.length; i++) {
            if(xx % (1 + numRows -2) == 0){
                array[xx][yy] = String.valueOf(chars[i]);
                yy++;
            } else {
                array[xx][(i/(charsNumPerGroup) +1) * (numRows-1)-xx] = String.valueOf(chars[i]);
                xx++;
                yy = 0;
            }
            if (yy == numRows) {
                yy = 0;
                xx++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < numRows; j++) {
            for (int i = 0; i < x; i++) {
                sb.append(array[i][j] == null ? "" : array[i][j]);
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        System.out.println(convert("A", 2));
    }
}
