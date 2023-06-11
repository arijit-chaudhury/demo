package com.example.demo.leetcode;

import java.util.StringTokenizer;

public class LeetCodeLengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trimmedString = s.trim();
        StringTokenizer tokenizer = new StringTokenizer(trimmedString," ");
        int length = tokenizer.countTokens();
        String a[] = new String[length];
        int i=0;
        while(tokenizer.hasMoreTokens()){
            a[i] = tokenizer.nextToken();
            i++;
        }
        return a[a.length-1].length();
    }

    public static void main(String[] args) {
        LeetCodeLengthOfLastWord lengthOfLastWord = new LeetCodeLengthOfLastWord();
        System.out.println(lengthOfLastWord.lengthOfLastWord("   fly me   to   the moon  "));
    }
}
