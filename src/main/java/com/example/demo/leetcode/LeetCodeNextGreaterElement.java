package com.example.demo.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

public class LeetCodeNextGreaterElement {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int a[] = new int[nums1.length];
        for(int i = 0; i<nums1.length; i++){
            for (int j = 0; j<nums2.length; j++){
                if (nums1[i] == nums2[j]){
                    if (j+1<nums2.length && nums1[i]<nums2[j+1]){
                        a[i] = nums2[j+1];
                    } else {
                        a[i] = -1;
                    }
                }
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int a[] = new int[]{4,1,2};
        int b[] = new int[]{1,3,4,2};
        LeetCodeNextGreaterElement nextGreaterElement = new LeetCodeNextGreaterElement();
        int c[] = nextGreaterElement.nextGreaterElement(a,b);
        Arrays.stream(c).boxed().forEach(System.out::println);
    }
}
