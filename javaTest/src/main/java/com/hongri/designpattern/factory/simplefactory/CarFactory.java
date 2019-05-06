package com.hongri.designpattern.factory.simplefactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class CarFactory {
    public static Car createCar(int carType) {
        Car car = null;
        switch (carType) {
            case CarTypeDef.CAR_TYPE_BMW_X5:
                //宝马X5系列
                car = new BMWCarX5();
                break;
            case CarTypeDef.CAR_TYPE_BMW_X7:
                //宝马X7系列
                car = new BMWCarX7();
                break;
            default:
                break;
        }
        return car;
    }
}
