package com.example.demo.leetcode;

import javax.persistence.SecondaryTable;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class LeetCodeHappyNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        LeetCodeHappyNumber leetCodeHappyNumber = new LeetCodeHappyNumber();
        System.out.println(leetCodeHappyNumber.isHappy(n));
    }

    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        if (n == 0) {
            return false;
        }
        while(n>=1 && !set.contains(n)){
            set.add(n);
            n = findNext(n);
        }
        return n==1;
    }

    private int findNext(int n) {
        int sum = 0;
        int remain = 0;
        while (n>0) {
            remain = n%10;
            sum = sum + remain*remain;
            n = n/10;
        }
        return sum;
    }
}
