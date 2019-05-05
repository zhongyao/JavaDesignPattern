package com.hongri.designpattern.proxy.dynamicproxy;

/**
 * Created by zhongyao on 2019-05-05.
 */
public class RealSubject implements Subject {
    @Override
    public void request() {
        System.out.println("RealSubject--request");
    }
}
