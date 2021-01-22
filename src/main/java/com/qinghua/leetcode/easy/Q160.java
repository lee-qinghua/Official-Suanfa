package com.qinghua.leetcode.easy;

public class Q160 {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    // 假设两个相同速度的人，一个走A+B的长度 一个走B+A的长度，
    // 因为总长度相同，如果有相同的部分，在到达终点前，会有几步是相同的元素
    // 走到尽头见不到你，于是走过你来时的路，等到相遇时才发现，你也走过我来时的路。
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        if (headA == null || headB == null) return null;
        ListNode A = headA;
        ListNode B = headB;

        // 如果没有相同的元素，最后会都等于null的时候退出
        while (A != B) {
            A = A == null ? headB : A.next;
            B = B == null ? headA : B.next;
        }
        return A;
    }
}
