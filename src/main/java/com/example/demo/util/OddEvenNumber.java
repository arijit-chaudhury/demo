package com.example.demo.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenNumber {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input = reader.readLine();
        formatInput(input);
    }

    private static void formatInput(String input) {
        String temp = "";
        List<Integer> data = Arrays.asList(input.split("")).stream().map(x->Integer.parseInt(x)).collect(Collectors.toList());
        System.out.println(data);
        for (int i=0; i<data.size()-1; i++) {
            int t1 = data.get(i);
            int t2 = data.get(i+1);
            System.out.println(t1+" "+t2);

            String evenOdd1 = (t1 % 2 == 0) ? "even" : "odd";
            String evenOdd2 = (t2 % 2 == 0) ? "even" : "odd";

            if(temp.isEmpty()){
                temp = "" + t1;
            }
            if (evenOdd1.equals("even") && evenOdd2.equals("even")){
                temp = temp + "*" + t2;
            } else if (evenOdd1.equals("odd") && evenOdd2.equals("odd")){
                temp = temp + "-" + t2;
            } else {
                temp = temp + t2;
            }
        }
        System.out.println(temp);
    }

    private static void formatInput2(String input) {
        Arrays.asList(input.split(""));
    }
}