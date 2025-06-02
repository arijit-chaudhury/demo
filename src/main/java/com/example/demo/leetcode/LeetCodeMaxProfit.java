package com.example.demo.leetcode;

import org.springframework.core.ReactiveAdapterRegistry;

public class LeetCodeMaxProfit {

    public static void main(String[] args) {
        LeetCodeMaxProfit leetCodeMaxProfit = new LeetCodeMaxProfit();
        int[] prices = {7,1,5,3,6,4};
        System.out.println(leetCodeMaxProfit.solution(prices));
    }

    private int solution(int[] prices) {
        int profit = 0;
        int minPrice = prices[0];
        for(int i = 1; i <prices.length; i++){
            if (prices[i] < minPrice){
                minPrice = prices[i];
            }
            System.out.println("minPrice: "+minPrice);
            profit = Math.max(profit, prices[i]-minPrice);
            System.out.println("profit: "+profit);
        }
        return profit;
    }

}
