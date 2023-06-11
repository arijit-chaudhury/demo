package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeSpiralMatrix {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> spiral = new ArrayList<Integer>();
        if(matrix.length == 0) return spiral;

        int top =0;
        int left = 0;
        int bottom = matrix.length;
        int right = matrix[0].length;
        int k;

        while(top<bottom && left<right){
            for (k=left; k<right; k++){
                spiral.add(matrix[top][k]);
            }
            top++;
            for (k=top; k<bottom; k++){
                spiral.add(matrix[k][right-1]);
            }
            right--;
            if(top<bottom) {
                for (k = right - 1; k >= left; k--) {
                    spiral.add(matrix[bottom - 1][k]);
                }
                bottom--;
            }
            if(left<right) {
                for (k = bottom - 1; k >= top; k--) {
                    spiral.add(matrix[k][left]);
                }
                left++;
            }
        }
        return spiral;
    }

    public static void main(String[] args) {
        int a[][] = new int[][]{{1, 2, 3, 4},{5, 6, 7,8},{9, 10, 11, 12}};
        LeetCodeSpiralMatrix spiralMatrix = new LeetCodeSpiralMatrix();
        System.out.println(spiralMatrix.spiralOrder(a));
    }
}
