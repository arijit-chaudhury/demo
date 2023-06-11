package com.example.demo.leetcode;

public class LeetCodeValidPalindrome {
    public boolean isPalindrome(String s) {
        StringBuilder str = new StringBuilder();
        String s1 = s.toLowerCase();
        for(int i=0; i<s1.length(); i++){
            char c = s1.charAt(i);
            if(c==' ' || !Character.isLetterOrDigit(c)){
                continue;
            }
            str.append(c);
        }
        String s2 = str.toString();
        StringBuilder str2 = new StringBuilder();
        for (int i=s2.length()-1; i>=0; i--){
            str2.append(s2.charAt(i));
        }
        if (str.toString().equalsIgnoreCase(str2.toString())){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        LeetCodeValidPalindrome validPalindrome = new LeetCodeValidPalindrome();
        System.out.println(validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
    }
}
