package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BenzAirConditioner implements AirConditioner {

    public BenzAirConditioner() {
        System.out.println("BenzAirConditioner--生产啦");
    }

    @Override
    public void blow() {
        System.out.println("BenzAirConditioner--blow");
    }
}
