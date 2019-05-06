package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BenzCarFactory implements ICarFactory {

    @Override
    public Engine createEngine() {
        return new BenzEngine();
    }

    @Override
    public AirConditioner createAirConditioner() {
        return new BenzAirConditioner();
    }
}
