package com.qinghua.xuexi.chapter3;

public class 数组队列 {
    public static void main(String[] args) {
        ArrayQueue queue = new ArrayQueue(3);
        queue.addQueue(3);
        queue.addQueue(4);
        System.out.println(queue.headQueue());
        System.out.println("=================================");
        System.out.println(queue.popQueue());
        System.out.println("=================================");
        queue.show();
    }

    static class ArrayQueue {
        private int maxSize;
        private int front;//队列头
        private int rear;//队列尾
        private int[] arr;//存放数据

        public ArrayQueue(int max) {
            maxSize = max;
            arr = new int[maxSize];
            front = -1;//指向队列头前一个位置
            rear = -1;//指向队列尾部（就是队列最后一个数据）
        }

        //判断队列是否满了
        public boolean isFull() {
            return rear == maxSize - 1;
        }

        //判断队列是否为空  当rear和fornt相等时
        public boolean isEmpty() {
            return rear == front;
        }

        public void addQueue(int value) {
            if (isFull()) {
                System.out.println("队列满了");
                return;
            }
            rear++;
            arr[rear] = value;
        }

        //弹出数据
        public int popQueue() {
            if (isEmpty()) {
                throw new RuntimeException("队列为空！");
            }
            front++;
            return arr[front];
        }

        //显示所有数据
        public void show() {
            if (isEmpty()) {
                System.out.println("队列为空！！！");
            }
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        //显示头数据
        public int headQueue() {
            if (isEmpty()) {
                throw new RuntimeException("队列为空！");
            }
            return arr[front + 1];
        }

    }
}
