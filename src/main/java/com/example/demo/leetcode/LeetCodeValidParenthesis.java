package com.example.demo.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Scanner;
import java.util.Stack;

public class LeetCodeValidParenthesis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(isValidParenthesis2(str));
    }

    private static boolean isValidParenthesis(String str) {
        Stack<Character> characters = new Stack<>();
        for(char c : str.toCharArray()){
            if (c=='('){
                characters.push(')');
            } else if (c=='{') {
                characters.push('}');
            } else if (c=='[') {
                characters.push(']');
            } else if(characters.isEmpty() || characters.pop() != c){
                return false;
            }
        }
        return characters.isEmpty();
    }

    private static boolean isValidParenthesis2(String str) {
        Deque<Character> deque = new ArrayDeque<>(str.length());
        for(char c : str.toCharArray()){
            if (deque.peek() == complement(c)) deque.pop();
            else deque.push(c);
        }

        return deque.isEmpty();
    }

    private static Character complement(char c) {
        switch (c){
            case ')': return '(';
            case '}': return '{';
            case ']': return '[';
            default: return ' ';
        }
    }
}








