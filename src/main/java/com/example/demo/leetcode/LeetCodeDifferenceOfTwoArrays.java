package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class LeetCodeDifferenceOfTwoArrays {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> num1List = Arrays.stream(nums1)
                .boxed()
                .collect(Collectors.toList());
        List<Integer> num2List = Arrays.stream(nums2)
                .boxed()
                .collect(Collectors.toList());

        List<Integer> collect1 = num1List.stream().filter(x-> !num2List.contains(x)).distinct().collect(Collectors.toList());
        List<Integer> collect2 = num2List.stream().filter(x-> !num1List.contains(x)).distinct().collect(Collectors.toList());
        List<List<Integer>> returnList = new ArrayList<>();
        returnList.add(collect1);
        returnList.add(collect2);
        return returnList;
    }

    public static void main(String[] args) {
        int[] num1 = {1,2,3,3};
        int[] num2 = {1,1,2,2};
        LeetCodeDifferenceOfTwoArrays difference = new LeetCodeDifferenceOfTwoArrays();
        System.out.println(difference.findDifference(num1,num2));
    }
}
