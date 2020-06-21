package com.qinghua.xuexi.chapter5;

public class StackAccmulator {
    public static void main(String[] args) {

        System.out.println(method("7*2*2-5+1+3-3"));
    }

    //输入“7*2*2-5+1+3-3”的字符串
    //求表达式的结果
    public static int method(String str) {
        //思路：* + - 符号有优先级，每当碰到优先级大的就从数字栈中 弹出两个做计算，然后再放入栈。最后在进行低级的运算
        ArrayStack stackValue = new ArrayStack(str.length());
        ArrayStack stackOper = new ArrayStack(str.length());

        char[] array = str.toCharArray();
        //第一步：把乘法计算完毕
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 1) {
                if (isFirstLevel(array[i])) {
                    int preValue = stackValue.pop();
                    int value = preValue * (array[i + 1] - '0');
                    stackValue.add(value);
                    i++;
                } else {
                    stackOper.add(array[i]);
                }
            } else {
                int i1 = array[i] - '0';
                stackValue.add(i1);
            }
        }
        stackValue.list();
        System.out.println();
        stackOper.list();
        System.out.println();

        //第二步：计算加减发
        while (!stackOper.isEmpty()) {
            int pop = stackOper.pop();
            int pop1 = stackValue.pop();
            int pop2 = stackValue.pop();
            switch (pop) {
                case '+':
                    int i = pop1 + pop2;
                    stackValue.add(i);
                    break;
                case '-':
                    int i1 = pop2 - pop1;
                    stackValue.add(i1);
                    break;
                default:
                    break;
            }
        }
        return stackValue.pop();

    }

    public static boolean isFirstLevel(char c) {
        boolean flage = false;
        switch (c) {
            case '*':
                flage = true;
                break;
            default:
                flage = false;
                break;
        }
        return flage;
    }
}