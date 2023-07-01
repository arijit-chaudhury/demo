package com.example.demo.leetcode;

public class LeetCodeNextGreaterLetter {
    public char nextGreatestLetter(char[] letters, char target) {
        if (letters.length>0 && letters[letters.length-1]<target)
            return letters[0];
        for (char letter : letters){
            if (letter > target)
                return letter;
        }
        return letters[0];
    }

    public static void main(String[] args) {
        char c[] = new char[]{'c','f','j'};
        LeetCodeNextGreaterLetter greaterLetter = new LeetCodeNextGreaterLetter();
        greaterLetter.nextGreatestLetter(c, 'a');
    }
}
