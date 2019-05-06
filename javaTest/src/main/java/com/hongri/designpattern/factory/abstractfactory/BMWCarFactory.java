package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BMWCarFactory implements ICarFactory {

    @Override
    public Engine createEngine() {
        return new BMWEngine();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new BMWAirConditioner();
    }
}
