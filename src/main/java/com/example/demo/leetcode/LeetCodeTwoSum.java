package com.example.demo.leetcode;

import java.util.Arrays;

public class LeetCodeTwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] index = new int[2];
        for (int i=0; i<nums.length; i++){
            for(int j=i+1; j<nums.length; j++){
                int sum = nums[i]+nums[j];
                if(sum == target){
                    index[0] = i;
                    index[1] = j;
                    Arrays.stream(index).boxed().forEach(x->System.out.print(x));
                    return index;
                }
            }
        }
        return index;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 9;

        LeetCodeTwoSum sum = new LeetCodeTwoSum();
        sum.twoSum(nums, target);
    }
}
