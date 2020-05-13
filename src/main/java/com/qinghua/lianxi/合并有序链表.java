package com.qinghua.lianxi;

//21. 合并两个有序链表
class 合并有序链表 {
//输入：1->2->4, 1->3->4
//输出：1->1->2->3->4->4

    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

    public static ListNode mergeTwoLists2(ListNode l1, ListNode l2) {
        ListNode listNode = new ListNode(-1);
        ListNode head = listNode;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                head.next = new ListNode(l1.val);
                l1 = l1.next;
            } else {
                head.next = new ListNode(l2.val);
                l2 = l2.next;
            }
            head = head.next;
        }
        if (l1!=null) head.next=l1;
        if (l2!=null) head.next=l2;

        return listNode.next;
    }

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
        l1.next.next = new ListNode(4);

        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        ListNode node = mergeTwoLists2(l1, l2);

        while (node != null) {
            System.out.println(node.val);
            node = node.next;
        }
    }

}
