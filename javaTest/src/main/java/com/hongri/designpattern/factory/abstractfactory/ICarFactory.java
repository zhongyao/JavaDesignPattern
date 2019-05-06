package com.hongri.designpattern.factory.abstractfactory;

/**
 * Created by zhongyao on 2019-05-06.
 */
public interface ICarFactory {
    /**
     * 制造发动机
     * @return
     */
    Engine createEngine();

    /**
     * 制造空调
     * @return
     */
    AirConditioner createAirConditioner();
}
