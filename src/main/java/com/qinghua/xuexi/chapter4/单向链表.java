package com.qinghua.xuexi.chapter4;

import java.util.Stack;

public class 单向链表 {
    public static void main(String[] args) {
        LinkList linkList = new LinkList(1);
        linkList.next = new LinkList(2);
        linkList.next.next = new LinkList(3);

        LinkList linkList2 = new LinkList(1);
        linkList2.next = new LinkList(4);
        linkList2.next.next = new LinkList(5);
//        method1(linkList);
        method3(linkList,linkList2);
    }

    static class LinkList {
        private int value;
        private LinkList next;

        public LinkList() {
        }

        public LinkList(int value) {
            this.value = value;
        }

    }

    /**
     * 单向链表反转
     */
    public static void method(LinkList list) {
        LinkList temp = list;
        LinkList nextnode = null;
        LinkList newList = new LinkList(0);

        while (temp != null) {
            nextnode = temp.next;
            temp.next = newList.next;
            newList.next = temp;
            temp = nextnode;
        }
        //验证
        LinkList temp2 = newList.next;
        while (temp2 != null) {
            System.out.println(temp2.value);
            temp2 = temp2.next;
        }

    }

    /**
     * 反向打印 要求不破坏链表的结构
     */
    public static void method1(LinkList list) {
        //放到栈里面
        Stack stack = new Stack();
        LinkList temp = list;
        while (temp != null) {
            stack.push(temp.value);
            temp = temp.next;
        }
        while (stack.size() > 0) {
            System.out.println(stack.pop());
        }

    }

    /**
     * 合并两个有序链表(从小到大)
     */
    public static void method3(LinkList list1, LinkList list2) {
        //用于存放结果
        LinkList newList = new LinkList(0);
        LinkList head = newList;


        while (list1 != null && list2 != null) {
            int value1 = list1.value;
            int value2 = list2.value;
            if (value1 < value2) {
                head.next = new LinkList(value1);
                head = head.next;
                list1 = list1.next;
            } else if (value1 > value2) {
                head.next = new LinkList(value2);
                head = head.next;
                list2 = list2.next;
            } else {
                head.next = new LinkList(value2);
                head.next.next = new LinkList(value2);
                head = head.next.next;
                list1 = list1.next;
                list2 = list2.next;
            }
        }
        if (list1 != null) head.next = list1;
        if (list2 != null) head.next = list2;
        //测试
        LinkList aaa = newList.next;
        while (aaa != null) {
            System.out.println(aaa.value);
            aaa = aaa.next;
        }

    }
}
