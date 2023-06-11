package com.example.demo.util;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.push(10);
        deque.push(20);
        deque.push(30);
        deque.push(15);
        deque.push(17);
        System.out.println(deque);
    }
}
