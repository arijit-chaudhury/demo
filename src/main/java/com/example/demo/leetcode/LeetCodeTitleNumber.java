package com.example.demo.leetcode;

public class LeetCodeTitleNumber {
    public int titleToNumber(String s) {
        if (s == null) return -1;
        int sum = 0;
        // for each loop so we don't need to mess with index values.
        for (char c : s.toUpperCase().toCharArray()) {
            sum = sum * 26;
            sum = sum + c - 'A' + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        LeetCodeTitleNumber titleNumber = new LeetCodeTitleNumber();
        System.out.println(titleNumber.titleToNumber("AAA"));
    }
}
