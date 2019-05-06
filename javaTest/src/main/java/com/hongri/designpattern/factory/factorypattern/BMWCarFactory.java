package com.hongri.designpattern.factory.factorypattern;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BMWCarFactory implements ICarFactory {
    @Override
    public BMWCar createCar() {
        System.out.println("begin--create--BMWCar");
        return new BMWCar();
    }
}
