package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePascalTriangle3 {
    public static void main(String[] args) {
        LeetCodePascalTriangle3 leetCodePascalTriangle3 = new LeetCodePascalTriangle3();
        System.out.println(leetCodePascalTriangle3.getRow(3));
    }
    public List<Integer> getRow(int rowIndex) {
        rowIndex = rowIndex+1;
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        ans.add(new ArrayList<>(curr));
        if(rowIndex == 1){
            return curr;
        }

        for(int rows = 1;rows<rowIndex;rows++){
            List<Integer> prev = curr;
            curr = new ArrayList<>();
            curr.add(1);
            for(int i=1;i<prev.size();i++){
                curr.add(prev.get(i)+prev.get(i-1));
            }
            curr.add(1);
            ans.add(new ArrayList<>(curr));
        }
        return curr;
    }
}
