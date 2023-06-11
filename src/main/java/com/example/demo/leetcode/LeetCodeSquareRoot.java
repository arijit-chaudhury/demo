package com.example.demo.leetcode;

public class LeetCodeSquareRoot {
    public int mySqrt(int x) {
        return (int) Math.sqrt(x);
    }

    public static void main(String[] args) {
        LeetCodeSquareRoot squareRoot = new LeetCodeSquareRoot();
        System.out.println(squareRoot.mySqrt(8));
    }
}
