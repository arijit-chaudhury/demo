package com.example.demo.leetcode;

public class LeetCodeAddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry=0;
        ListNode head = new ListNode(0);
        ListNode current = head;
        ListNode p1 = l1;
        ListNode p2 = l2;

        while(p1!=null || p2!=null){
            int sum = 0;
            if (p1!=null){
                sum = sum + p1.val;
                p1 = p1.next;
            }
            if (p2!=null){
                sum = sum + p2.val;
                p2 = p2.next;
            }
            sum = carry + sum;
            carry = sum/10;
            sum = sum%10;
            current.next = new ListNode(sum);
            current = current.next;
        }
        return head.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode list2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        LeetCodeAddTwoNumbers addTwoNumbers = new LeetCodeAddTwoNumbers();
        ListNode listNode = addTwoNumbers.addTwoNumbers(list1, list2);
        while (listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }
    }
}
