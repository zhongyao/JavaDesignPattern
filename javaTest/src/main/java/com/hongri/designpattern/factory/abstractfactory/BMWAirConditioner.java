package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public class BMWAirConditioner implements AirConditioner {

    public BMWAirConditioner(){
        System.out.println("BMWAirConditioner--生产啦");
    }

    @Override
    public void blow() {
        System.out.println("BMWAirConditioner--blow");
    }
}
