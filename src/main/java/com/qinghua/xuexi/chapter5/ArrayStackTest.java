package com.qinghua.xuexi.chapter5;

public class ArrayStackTest {
    public static void main(String[] args) {
        ArrayStack stack = new ArrayStack(5);
        stack.add(1);
        stack.add(2);
        stack.add(3);
        System.out.println(stack.pop());
        stack.list();
    }
}

class ArrayStack {
    private int maxSize;//栈的大小
    private int[] stack;//数组，数组模拟栈
    private int top = -1;//表示栈顶 初始值为-1

    //构造器
    public ArrayStack(int maxSize) {
        this.maxSize = maxSize;
        stack = new int[this.maxSize];
    }

    public boolean isFull() {
        return top == maxSize;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    public void add(int value) {
        if (isFull()) return;
        top++;
        stack[top] = value;
    }

    //出栈
    public int pop() {
        if (isEmpty()) throw new RuntimeException("空");
        int i = stack[top];
        top--;
        return i;
    }

    public void list() {
        if (isEmpty()) return;
        for (int i = top; i >= 0; i--) {
            System.out.print(stack[i] + "     ");
        }
    }


}