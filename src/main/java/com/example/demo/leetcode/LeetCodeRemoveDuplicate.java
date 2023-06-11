package com.example.demo.leetcode;

public class LeetCodeRemoveDuplicate {

      public ListNode deleteDuplicates(ListNode head) {
        ListNode temp = head;
        while(temp != null && temp.next != null){
            if (temp.val == temp.next.val){
                temp.next = temp.next.next;
                continue;
            }
            temp = temp.next;
        }
        return temp;
      }

      public static void main(String[] args) {
          LeetCodeRemoveDuplicate removeDuplicate = new LeetCodeRemoveDuplicate();
          ListNode list1 = new ListNode(1, new ListNode(1, new ListNode(2)));
          removeDuplicate.deleteDuplicates(list1);
      }

}
