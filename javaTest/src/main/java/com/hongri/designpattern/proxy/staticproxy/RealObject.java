package com.hongri.designpattern.proxy.staticproxy;

/**
 * Created by zhongyao on 2019-05-05.
 */
public class RealObject extends AbstractObject {
    @Override
    public void operation() {
        System.out.println("调用目标对象--operation");
    }
}
