package com.qinghua.leetcode.medium;

public class Q61 {
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

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode temp = head;
        int size = 0;

        while (temp != null) {
            size++;
            temp = temp.next;
        }


        int position;
        if (size == 0 || size == 1 || (position = k % size) == 0) return head;

        ListNode a = head;
        ListNode b = head;

        for (int i = 0; i < position; ++i) {
            b = b.next;
        }


        while (b.next != null) {
            a = a.next;
            b = b.next;
        }

        ListNode c = a.next;

        a.next = null;
        b.next = head;

        return c;
    }

    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        listNode.next.next.next = new ListNode(4);
        rotateRight(listNode, 2);
    }
}
