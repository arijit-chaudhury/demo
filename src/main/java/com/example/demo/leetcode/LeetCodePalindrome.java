package com.example.demo.leetcode;

public class LeetCodePalindrome {
    public boolean isPalindrome(int x) {
        int original = x;
        int sum = 0;
        while(x>0){
            int reminder = x%10;
            sum = sum*10 + reminder;
            x = x/10;
        }
        System.out.println(sum);
        if (original == sum)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int palindromeNumber = 1271;
        LeetCodePalindrome palindrome = new LeetCodePalindrome();
        System.out.println(palindrome.isPalindrome(palindromeNumber));
    }
}
