package com.example.demo.leetcode;

public class LeetCodeFindDifferences {
    public char findTheDifference(String s, String t) {
        int x = t.indexOf(s);
        return t.substring(s.length()).charAt(0);
    }

    public static void main(String[] args) {
        LeetCodeFindDifferences differences = new LeetCodeFindDifferences();
        System.out.println(differences.findTheDifference("abcd","abcde"));
    }
}
