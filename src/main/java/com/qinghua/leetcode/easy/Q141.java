package com.qinghua.leetcode.easy;

import javafx.scene.control.TableRow;

import java.util.HashSet;

public class Q141 {
    public static void main(String[] args) {

    }

    class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodes = new HashSet<>();
        while (head != null) {
            if (!nodes.add(head)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    /**
     * 这种有环的问题可以想象成龟兔赛跑（一个快指针，一个慢指针）快指针每次移动2步，满指针每次移动1步
     * 如果没有环，兔子跑到终点
     * 如果有环，兔子会在一个时间和乌龟相遇。可能在环中相差n圈
     * 判断条件是 当快指针=慢指针是，证明有环
     *
     * @param head
     * @return
     */

    public boolean hasCycle2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }

        ListNode man = head;
        ListNode kuai = head.next;
        while (man != kuai) {
            if (kuai == null || kuai.next == null) {
                return false;
            }
            man = man.next;
            kuai = kuai.next.next;
        }
        return true;
    }
}
