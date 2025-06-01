package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodePascalTriangle2 {
    public static void main(String[] args) {
        LeetCodePascalTriangle2 leetCodePascalTriangle2 = new LeetCodePascalTriangle2();
        System.out.println(leetCodePascalTriangle2.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        curr.add(1);
        ans.add(new ArrayList<>(curr));
        if(numRows == 1){
            return ans;
        }

        for(int rows = 1;rows<numRows;rows++){
            List<Integer> prev = curr;
            curr = new ArrayList<>();
            curr.add(1);
            for(int i=1;i<prev.size();i++){
                curr.add(prev.get(i)+prev.get(i-1));
            }
            curr.add(1);
            ans.add(new ArrayList<>(curr));
        }
        return ans;
        }
}
