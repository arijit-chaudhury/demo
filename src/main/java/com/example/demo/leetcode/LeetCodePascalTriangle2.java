package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePascalTriangle2 {
    public static void main(String[] args) {
        LeetCodePascalTriangle2 leetCodePascalTriangle2 = new LeetCodePascalTriangle2();
        System.out.println(leetCodePascalTriangle2.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();
        if (numRows == 0) return triangle;

        triangle.add(new ArrayList<>());
        triangle.get(0).add(1);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prev_row = triangle.get(i - 1);
            List<Integer> new_row = new ArrayList<>();

            for (int j = 1; j < prev_row.size(); j++) {
                System.out.println("inside for loop j-1 "+prev_row.get(j - 1));
                System.out.println("inside for loop j "+prev_row.get(j));
                new_row.add(prev_row.get(j - 1) + prev_row.get(j));
            }
            new_row.add(1);
            triangle.add(new_row);
        }

        return triangle;
    }
}
