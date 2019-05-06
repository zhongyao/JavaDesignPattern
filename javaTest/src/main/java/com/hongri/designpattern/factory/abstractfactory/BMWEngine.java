package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BMWEngine implements Engine {

    public BMWEngine(){
        System.out.println("BMWEngine--生产啦");
    }

    @Override
    public void rotate() {
        System.out.println("BMWEngine--rotate");
    }
}
