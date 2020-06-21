package com.qinghua.lianxi;


class Solution {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);


        ListNode listNode1 = method(listNode);
        ListNode temp = listNode1;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }

    public static ListNode method(ListNode target) {
        ListNode head = new ListNode(-1);
        ListNode temp = target;
        while (temp != null) {
            ListNode next = temp.next;
            temp.next = head.next;
            head.next = temp;
            temp = next;
        }
        return head.next;
    }


    //时间复杂度时0(n) 空间复杂度01
    public static ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode current = head;
        while (current != null) {
            ListNode next = current.next;
            current.next = pre;
            pre = current;
            current = next;
        }
        return pre;
    }


    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}