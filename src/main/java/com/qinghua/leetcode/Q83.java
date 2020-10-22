package com.qinghua.leetcode;

import java.util.ArrayList;
import java.util.HashMap;

public class Q83 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        ArrayList<Integer> list = new ArrayList<>();
        ListNode b = new ListNode(0);
        ListNode a = head;
        while (a != null) {
            int value = a.val;
            boolean flage = list.contains(value);
            if (flage) {
                a = a.next;
            } else {
                b.next.val = value;
            }
        }
    }
}
