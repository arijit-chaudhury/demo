package com.example.demo.leetcode;

import java.util.Arrays;

public class LeetCodePlusOne {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        for (int i=n-1; i>=0; i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }
        int[] a = new int[n+1];
        a[0]=1;
        return a;
    }

    public static void main(String[] args) {
        LeetCodePlusOne plusOne = new LeetCodePlusOne();
        int[] ints = plusOne.plusOne(new int[]{9,8,9});
        Arrays.stream(ints).boxed().forEach(x->System.out.println(x));
    }
}
