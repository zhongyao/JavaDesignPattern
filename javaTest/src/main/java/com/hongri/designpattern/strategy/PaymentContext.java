package com.hongri.designpattern.strategy;

/**
 * @author zhongyao
 * @date 2019-11-03
 * 支付策略的上下文
 */
public class PaymentContext {

    /**
     * 应被支付人员的用户名
     */
    private String mUserName;

    /**
     * 应被支付的工资金额
     */
    private double mMoney;

    /**
     * 支付工资的方式的策略接口
     */
    private IPaymentStrategy mIPaymentStrategy;

    public PaymentContext(String userName, double money, IPaymentStrategy paymentStrategy) {
        mUserName = userName;
        mMoney = money;
        mIPaymentStrategy = paymentStrategy;
    }


    public String getUserName() {
        return mUserName;
    }

    public double getMoney() {
        return mMoney;
    }

    public void payNow(){
        mIPaymentStrategy.pay(this);
    }

}
