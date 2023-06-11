package com.example.demo.leetcode;

public class LeetCodeParkingSystem {
    int big, medium, small = 0;
    public LeetCodeParkingSystem(int big, int medium, int small) {
        this.big = big;
        this.medium = medium;
        this.small = small;
    }
    public boolean addCar(int carType) {
        switch (carType){
            case 1: {
                if (big!=0){
                    big--;
                    return true;
                } else {
                    return false;
                }
            }
            case 2: {
                if (medium!=0){
                    medium--;
                    return true;
                } else {
                    return false;
                }
            }
            case 3: {
                if (small!=0){
                    small--;
                    return true;
                } else {
                    return false;
                }
            }
            default: {
                return false;
            }
        }
    }

    public static void main(String[] args) {
        LeetCodeParkingSystem obj = new LeetCodeParkingSystem(1, 1, 0);
        boolean param_1 = obj.addCar(1);
        System.out.println(param_1);
    }
}
