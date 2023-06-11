package com.example.demo.leetcode;

import java.util.HashSet;
import java.util.Set;

public class LeetCodeSingleNumber {
    public int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i=0; i<nums.length; i++){
            int val = nums[i];
            if(set.contains(val)){
                set.remove(val);
            } else {
                set.add(val);
            }
        }
        return set.stream().findFirst().get();
    }
    public static void main(String[] args) {
        LeetCodeSingleNumber singleNumber = new LeetCodeSingleNumber();
        System.out.println(singleNumber.singleNumber(new int[]{2,2,1}));
    }
}
