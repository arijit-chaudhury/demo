package com.example.demo.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeetCodeSearchPosition {
    public int searchInsert(int[] nums, int target) {
        if (nums.length == 0){
            return -1;
        }
        for (int i=0; i< nums.length; i++) {
            if(nums[i]==target || nums[i] > target){
                return i;
            } else if (nums[i] < target){
                continue;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {
        LeetCodeSearchPosition searchPosition = new LeetCodeSearchPosition();
        System.out.println(searchPosition.searchInsert(new int[]{1,3,5,6}, 7));
    }
}
