package com.kai.algorithm;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    /**
     * Description:
     * Given a string, find the length of the longest substring without repeating characters.
     * Examples:
     * Given "abcabcbb", the answer is "abc", which the length is 3.
     * Given "bbbbb", the answer is "b", with the length of 1.
     * Given "pwwkew", the answer is "wke", with the length of 3. Note that the answer must be a substring, "pwke" is a subsequence and not a substring.
     */

    public static int lengthOfLongestSubstring(String s) {
        //reference url: https://leetcode.com/problems/longest-substring-without-repeating-characters/solution/
        //Sliding Window Algorithm

        int len = 0, i = 0, j = 0;
        int n = s.length();
        Set<Character> charSet = new HashSet<>();
        while (i < n && j < n) {
            if (!charSet.contains(s.charAt(j))) {
                charSet.add(s.charAt(j));
                j++;
                len = Math.max(len, j-i);
            } else {
                charSet.remove(s.charAt(i++));
            }
        }

        return len;
    }
}
