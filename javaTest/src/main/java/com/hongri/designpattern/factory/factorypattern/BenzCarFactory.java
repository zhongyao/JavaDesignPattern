package com.hongri.designpattern.factory.factorypattern;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BenzCarFactory implements ICarFactory {
    @Override
    public BenzCar createCar() {
        System.out.println("begin--create--BenzCar");
        return new BenzCar();
    }
}
