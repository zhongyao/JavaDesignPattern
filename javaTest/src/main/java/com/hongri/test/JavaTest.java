package com.hongri.test;

/**
 * Created by zhongyao on 2019-05-20.
 */
public class JavaTest {
    public static void main(String[] args) {
        boolean name;

        /**
         * a == null  与  null == a 写法的区别：
         *
         * 这种说法其实是不确切的噢。在java中: 当a = null的时候，if (a == null){ ... } 或者 if ( null == a){ ... }都是可以正常运行的。
         * 出现这种写法的原因是在C语言中出现的，在C语言中 if (a = null) { ... } 【少敲打一个符号 ‘=’的情况下】编译不会报错，但是写成 if (null = a){ ... }编译就会报错。
         * 所以在C语言中会鼓励程序员使用 null == a 来进行判断。
         */
        Info info = new Info();
        info = null;
        if (null == info) {
            System.out.println("----null test---");
        }
    }
}
