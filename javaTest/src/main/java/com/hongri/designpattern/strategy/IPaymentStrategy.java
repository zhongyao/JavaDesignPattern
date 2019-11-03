package com.hongri.designpattern.strategy;

/**
 *
 * @author zhongyao
 * @date 2019-11-03
 * 定义支付的策略接口
 */
public interface IPaymentStrategy {

    void pay(PaymentContext context);
}
