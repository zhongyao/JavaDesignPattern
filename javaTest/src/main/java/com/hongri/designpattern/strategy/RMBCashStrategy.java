package com.hongri.designpattern.strategy;

/**
 * 人民币现金支付策略实现类
 *
 * @author zhongyao
 * @date 2019-11-03
 */
public class RMBCashStrategy implements IPaymentStrategy {
    @Override
    public void pay(PaymentContext context) {
        System.out.println(
            "支付方式：人民币现金支付 " + "收款人---姓名：" + context.getUserName() + " 工资：" + context.getMoney()
                + "\n");
    }
}
