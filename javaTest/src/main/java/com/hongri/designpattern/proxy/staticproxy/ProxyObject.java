package com.hongri.designpattern.proxy.staticproxy;

/**
 * Created by zhongyao on 2019-05-05.
 */
public class ProxyObject extends AbstractObject {

    private RealObject realObject;

    public ProxyObject(RealObject realObject) {
        //传递过来目标对象的引用，这样代理对象包含目标对象的引用，可以随时操作目标对象
        this.realObject = realObject;
    }

    @Override
    public void operation() {
        System.out.println("调用代理对象--begin");
        //此处使用目标对象调用其目标方法
        realObject.operation();
        System.out.println("调用代理对象--end");
    }
}
