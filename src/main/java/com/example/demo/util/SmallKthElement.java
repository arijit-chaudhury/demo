package com.example.demo.util;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SmallKthElement {
    public static void main(String[] args) {
        Integer a[] = {4,3,5,9,2,3};
        int kthElement = 3;
        findKthElement(a, kthElement);
    }

    private static void findKthElement(Integer[] a, int kthElement) {
        List<Integer> collect = Arrays.stream(a).distinct().collect(Collectors.toList());
        Collections.sort(collect);
        System.out.println(collect);
        if (collect.size() >= kthElement){
            System.out.println(collect.get(kthElement-1));
        } else {
            System.out.println("NULL");
        }
    }
}
