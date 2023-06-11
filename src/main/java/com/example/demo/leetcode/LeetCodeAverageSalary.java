package com.example.demo.leetcode;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class LeetCodeAverageSalary {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int min = salary[0];
        int max = salary[salary.length-1];
        List<Integer> data = IntStream.of(salary).boxed().collect(Collectors.toList());
        data.remove(Integer.valueOf(min));
        data.remove(Integer.valueOf(max));
        return data.stream().mapToDouble(x -> x).average().getAsDouble();
    }

    public static void main(String[] args) {
        int[] salary = {8000,9000,2000,3000,6000,1000};
        LeetCodeAverageSalary averageSalary = new LeetCodeAverageSalary();
        System.out.println(averageSalary.average(salary));
    }
}
