package com.hongri.designpattern.factory.factorypattern;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BenzCar implements Car {

    public BenzCar() {
        System.out.println("BenzCar--生产啦");
    }

    @Override
    public void drive() {
        System.out.println("BenzCar--启动啦");
    }
}
