package com.example.demo.leetcode;

public class LeetCodeMergeTwoLists {

    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode temp = new ListNode(0);
        ListNode current = temp;
        while(list1!=null && list2!=null){
            if (list1.val<=list2.val){
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }
        current.next=list1!=null?list1:list2;
        return temp.next;
    }

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        LeetCodeMergeTwoLists sortedList = new LeetCodeMergeTwoLists();
        ListNode listNode = sortedList.mergeTwoLists(list1, list2);
        while(listNode!=null){
            System.out.println(listNode.val);
            listNode = listNode.next;
        }

    }
}


