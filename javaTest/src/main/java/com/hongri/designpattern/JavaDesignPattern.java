package com.hongri.designpattern;

import java.lang.reflect.Proxy;

import com.hongri.designpattern.proxy.dynamicproxy.ProxyHandler;
import com.hongri.designpattern.proxy.dynamicproxy.RealSubject;
import com.hongri.designpattern.proxy.dynamicproxy.Subject;
import com.hongri.designpattern.proxy.staticproxy.AbstractObject;
import com.hongri.designpattern.proxy.staticproxy.ProxyObject;
import com.hongri.designpattern.proxy.staticproxy.RealObject;

/**
 * @author hongri
 *
 * 参考：
 * https://www.cnblogs.com/pony1223/p/7608955.html
 * http://www.cnblogs.com/pony1223/p/7594803.html
 */
public class JavaDesignPattern {
    public static void main(String[] args) {

        /**
         * 静态代理测试
         */
        //实例化目标对象
        RealObject realObject = new RealObject();
        //将目标对象引用传递给代理对象
        AbstractObject proxyObject = new ProxyObject(realObject);
        //代理对象调动起自身的代理方法，代理方法内部会调用目标方法。
        proxyObject.operation();

        /**
         * 动态代理测试
         */
        //实例化目标对象
        RealSubject realSubject = new RealSubject();
        //将目标对象引用传至调用处理器类中
        ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        //动态生成代理
        Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(), RealSubject.class.getInterfaces(),
            proxyHandler);
        //调用代理方法
        proxySubject.request();
    }
}
