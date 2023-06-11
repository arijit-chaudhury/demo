package com.example.demo.leetcode;

import java.util.ArrayList;
import java.util.List;

public class LeetCodeReverseLinkedList {
    public ListNode reverseList(ListNode head) {
        ListNode temp = head;
        List<Integer> list = new ArrayList<>();
        while(temp!=null){
            list.add(temp.val);
            temp = temp.next;
        }

        ListNode prev = new ListNode(list.get(0));
        for (int i = 1; i<list.size(); i++){
            ListNode temp2 = new ListNode(list.get(i));
            temp2.next = prev;
            prev = temp2;
        }
        return prev;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        LeetCodeReverseLinkedList reverseLinkedList = new LeetCodeReverseLinkedList();
        ListNode list2 = reverseLinkedList.reverseList(list1);
        while (list2!=null){
            System.out.println(list2.val);
            list2 = list2.next;
        }
    }
}
