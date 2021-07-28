package com.qinghua.leetcode.medium;

public class Q24 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);

//        ListNode tmp = new ListNode(0);
//        ListNode cur = listNode;
//
//        tmp.next = cur.next;
//        while (tmp != null) {
//            System.out.println(tmp.val);
//            tmp = tmp.next;
//        }
        swapPairs(listNode);
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static ListNode swapPairs(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode tmp = res;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode node1 = tmp.next;
            ListNode node2 = tmp.next.next;
            tmp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            tmp = node1;
        }

        return res.next;
    }

    public static ListNode swapPairs2(ListNode head) {
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode tmp = res;
        while (tmp.next != null && tmp.next.next != null) {
            ListNode node1 = tmp.next;
            ListNode node2 = tmp.next.next;
            tmp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            tmp = node1;
        }
        return res.next;
    }

    public static ListNode sw(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newhead = head.next;
        head.next = swapPairs(newhead.next);
        newhead.next = head;
        return newhead;
    }
}
