package com.example.demo.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {

    public static void main(String[] args) throws Exception {
        int[] sample = {2, -4, 2, -1, 3, -3, 10, -1, -11, -100, 8, -1};
        System.out.println(calculateSum(sample));
    }

    private static int calculateSum(int[] sample) throws Exception {
        List<Integer> total = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i<sample.length-1; i++) {
            sum = sample[i];
            total.add(sum);
            for (int j = i+1; j< sample.length; j++){
                sum = sum + sample[j];
                total.add(sum);
            }

        }
        System.out.println(total);
        return Collections.max(total);
    }

}
