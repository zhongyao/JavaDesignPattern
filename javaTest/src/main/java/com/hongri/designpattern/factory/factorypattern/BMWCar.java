package com.hongri.designpattern.factory.factorypattern;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BMWCar implements Car {

    public BMWCar(){
        System.out.println("BMWCar--生产啦");
    }
    @Override
    public void drive() {
        System.out.println("BMWCar--启动啦");
    }
}
