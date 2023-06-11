package com.example.demo.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeRemoveDuplicates {
    public int removeDuplicates(int[] nums) {
        // 26
        List<Integer> collect = Arrays.stream(nums).boxed().distinct().collect(Collectors.toList());
        return collect.size();
    }

    public int removeDuplicates2(int[] arr) {
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        return i+1;
    }

    public static void main(String[] args) {
        LeetCodeRemoveDuplicates duplicates = new LeetCodeRemoveDuplicates();
        int[] nums = {0,0,1,1,1,2,2,3,3,4}; // Input array
        int[] expectedNums = {0,1,2,3,4}; // The expected answer with correct length
        int k = duplicates.removeDuplicates2(nums); // Calls your implementation
        assert k == expectedNums.length;
        for (int i = 0; i < k; i++) {
            assert nums[i] == expectedNums[i];
        }
    }
}
