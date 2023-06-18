package com.example.demo.leetcode;

import java.nio.charset.CharsetEncoder;
import java.util.Stack;

public class LeetCodeRemoveStars {
    public String removeStars(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i=0; i<s.length(); i++){
            if (s.charAt(i)=='*'){
                stack.pop();
            } else {
                stack.push(s.charAt(i));
            }
        }
        char c[] = new char[stack.size()];
        for(int i=c.length-1; i>=0; i--){
            c[i]=stack.pop();
        }
        StringBuilder sb = new StringBuilder();
        for(int j = 0; j<c.length; j++){
            sb.append(c[j]);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        LeetCodeRemoveStars removeStars = new LeetCodeRemoveStars();
        System.out.println(removeStars.removeStars("leet**cod*e"));
    }
}
