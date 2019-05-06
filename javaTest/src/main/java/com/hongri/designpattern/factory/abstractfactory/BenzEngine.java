package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BenzEngine implements Engine {

    public BenzEngine(){
        System.out.println("BenzEngine--生成啦");
    }

    @Override
    public void rotate() {
        System.out.println("BenzEngine--rotate");
    }
}
