package com.qinghua.lianxi;

public class 外观数列 {
    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n < 1) return null;
        if (n == 1) return "1";
        String s = countAndSay(n - 1);
        char[] array = s.toCharArray();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            if (i + 1 < array.length) {
                //判断和下一个元素是否相同
                if (array[i] == array[i + 1]) {
                    if (i + 2 < array.length) {
                        //判断和第二个元素是否相同
                        if (array[i] == array[i + 2]) {
                            builder.append("3").append(array[i]);
                            i = i + 2;
                        } else {
                            builder.append("2").append(array[i]);
                            i = i + 1;
                        }
                    } else {
                        builder.append("2").append(array[i]);
                        i = i + 1;
                    }
                } else {
                    builder.append("1").append(array[i]);
                }
            } else {
                builder.append("1").append(array[i]);
            }
        }
        return builder.toString();
    }
}
