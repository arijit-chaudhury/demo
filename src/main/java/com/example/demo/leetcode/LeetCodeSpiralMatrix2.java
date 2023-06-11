package com.example.demo.leetcode;

public class LeetCodeSpiralMatrix2 {
    public int[][] generateMatrix(int n) {
        int[][] a = new int[n][n];
        int total = n*n;
        int count = 1;
        int left = 0;
        int top = 0;
        int right = n-1;
        int bottom = n-1;

        while(count<=total){
            for (int i=left; i<=right && count<=total; i++){
                a[top][i]=count++;
            }
            top++;
            for (int i=top; i<=bottom && count<=total; i++){
                a[i][right]=count++;
            }
            right--;
            for (int i=right; i>=left && count<=total; i--){
                a[bottom][i]=count++;
            }
            bottom--;
            for (int i=bottom; i>=top && count<=total; i--){
                a[i][left]=count++;
            }
            left++;
        }
        return a;
    }

    public static void main(String[] args) {
        LeetCodeSpiralMatrix2 spiralMatrix2 = new LeetCodeSpiralMatrix2();
        int[][] ints = spiralMatrix2.generateMatrix(4);
        for (int i=0; i<ints.length; i++){
            for (int j=0; j<ints[0].length; j++){
                System.out.print(ints[i][j]);
            }
            System.out.println();
        }
    }
}
