package com.example.demo.leetcode;

import java.util.HashMap;
import java.util.Map;

public class LeetCodeIsometricString {
    public static void main(String[] args) {
        LeetCodeIsometricString leetCodeIsometricString = new LeetCodeIsometricString();
        String s = "egg";
        String t = "add";
        System.out.println(leetCodeIsometricString.solution(s, t));
    }

    private boolean solution(String s, String t) {
        Map<Character, Character> first = new HashMap<>();
        Map<Character, Character> second = new HashMap<>();
        boolean result = true;
        for (int i=0; i<s.length(); i++){
            char c_s = s.charAt(i);
            char c_t = t.charAt(i);
            if (!first.containsKey(c_s) && !second.containsKey(c_t)){
                first.put(c_s, c_t);
                second.put(c_t, c_s);
            } else if (first.containsKey(c_s) && first.get(c_s) != c_t){
                result = false;
            } else if (second.containsKey(c_t) && second.get(c_t) != c_s){
                result = false;
                break;
            }
        }
        return result;
    }
}
