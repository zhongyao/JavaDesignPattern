package com.hongri.designpattern.proxy.dynamicproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by zhongyao on 2019-05-05.
 */
public class ProxyHandler implements InvocationHandler {

    private RealSubject realSubject;

    public ProxyHandler(RealSubject realSubject) {
        this.realSubject = realSubject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("invoke--begin--");
        Object result = method.invoke(realSubject, args);
        System.out.println("invoke--end--");
        return result;
    }
}
