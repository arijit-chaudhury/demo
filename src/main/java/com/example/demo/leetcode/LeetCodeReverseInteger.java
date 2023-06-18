package com.example.demo.leetcode;

public class LeetCodeReverseInteger {
    public int reverse(int x) {
        long reverse = 0;
        while (x!=0){
            int rem = x%10; // 3 -> 2 ->
            reverse = reverse + rem; //3 -> 32 ->
            reverse = reverse*10; // 30 -> 320
            x = x/10; // 12 -> 1
        }
        reverse = reverse/10;
        if(reverse > Integer.MAX_VALUE || reverse<Integer.MIN_VALUE){
            return 0;
        }
        return (int)reverse;
    }
    public static void main(String[] args) {
        LeetCodeReverseInteger reverseInteger = new LeetCodeReverseInteger();
        System.out.println(reverseInteger.reverse(1534236469));
    }

}
