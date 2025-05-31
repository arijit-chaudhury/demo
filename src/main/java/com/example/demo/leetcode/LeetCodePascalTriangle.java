package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePascalTriangle {

    public static void main(String[] args) {
        LeetCodePascalTriangle leetCodePascalTriangle = new LeetCodePascalTriangle();
        System.out.println(leetCodePascalTriangle.generate(5));
    }

    private List<List<Integer>> generate(int rows) {
        List<List<Integer>> result = new ArrayList<>();
        for(int i = 0; i<rows; i++) {
            List<Integer> row = new ArrayList<>();
            int n = 1;
            for (int j = 0; j<=i; j++){
                System.out.println("i, j > "+i+", "+j);
                row.add(n);
                if (i == 0)
                    continue;
                n = ((i-j)*n)/(j+1);
            }
            result.add(row);
        }
        return result;
    }

    //i = 0 // 1
    //i = 1 // 1 1
    //i = 2 // 1 2 1
    //i = 3 // 1 3 3 1
    //i = 4 // 1 4 6 4 1

}
