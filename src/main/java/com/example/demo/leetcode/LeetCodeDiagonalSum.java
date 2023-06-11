package com.example.demo.leetcode;

public class LeetCodeDiagonalSum {

    public int diagonalSum(int[][] mat) {
        int n = mat.length;
        int sum = 0;
        for (int i=0; i<n; i++){
            for (int j=0; j<mat[i].length; j++){
                if (i==j){
                    sum = sum + mat[i][j];
                } else if (i==n-1-j){
                    sum = sum + mat[i][j];
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int[][] sampleData = {{1,2,3},{4,5,6},{7,8,9}};
        LeetCodeDiagonalSum sum = new LeetCodeDiagonalSum();
        sum.diagonalSum(sampleData);
    }
}
