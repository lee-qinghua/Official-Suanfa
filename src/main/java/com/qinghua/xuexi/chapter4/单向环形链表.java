package com.qinghua.xuexi.chapter4;

public class 单向环形链表 {
    public static void main(String[] args) {
        CircleLinkList circleLinkList = new CircleLinkList();
//        circleLinkList.addNode(5);
//        circleLinkList.showLinklist();
        circleLinkList.diushoujuan(5,1,2);
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

    static class CircleLinkList {
        private LinkList first = null;

        //创建
        public void addNode(int nums) {
            LinkList cur = null;
            for (int i = 1; i <= nums; i++) {
                LinkList list = new LinkList(i);
                if (i == 1) {
                    first = list;
                    first.next = first;//构成环
                    cur = first;//当前指针
                } else {
                    cur.next = list;
                    list.next = first;
                    cur = list;
                }
            }
        }

        //遍历
        public void showLinklist() {
            if (first == null) {
                return;
            }
            LinkList temp = first;
            while (true) {
                System.out.println(temp.value);
                if (temp.next == first) {
                    break;
                }
                temp = temp.next;
            }
        }

        //丢手绢出圈问题
        public void diushoujuan(int playerNums, int start, int count) {
            addNode(playerNums);
            if (first == null || start < 1 || start > playerNums) {
                System.out.println("输入有误！！！");
                return;
            }
            //创建辅助指针 始终样helper在first前面
            //初始化helper
            LinkList helper = first;
            while (true) {
                if (helper.next == first) {
                    break;
                }
                helper = helper.next;
            }

            //找到当前指定的报数位置
            for (int i = 0; i < start - 1; i++) {
                first = first.next;
                helper = helper.next;
            }

            //开始报数
            while (true) {
                if (helper == first) {//说明圈中只有一人
                    break;
                }
                for (int i = 0; i < count - 1; i++) {
                    first = first.next;
                    helper = helper.next;
                }
                //此时first就是要出圈的节点
                System.out.println(first.value + "  出圈了！！！");
                helper.next = first.next;
                first = first.next;
            }
        }

    }
}
