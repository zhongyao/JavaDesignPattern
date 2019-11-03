package com.hongri.designpattern.strategy.extend1;

import com.hongri.designpattern.strategy.IPaymentStrategy;
import com.hongri.designpattern.strategy.PaymentContext;

/**
 * 信用卡支付策略实现类
 * @author zhongyao
 * @date 2019-11-03
 */
public class CreditCardStrategy implements IPaymentStrategy {
    /**
     * 信用卡策略pay方法中，新增了账号打印
     * @param context
     */
    @Override
    public void pay(PaymentContext context) {

        //此处需使用新的上下文，需将context转成NewPaymentContext
        NewPaymentContext newPaymentContext = (NewPaymentContext)context;
        System.out.println(
            "支付方式：信用卡支付 " + "收款人---姓名：" + newPaymentContext.getUserName() + " 账号："
                + newPaymentContext.getAccount() + " 工资：" + newPaymentContext.getMoney()
                + "\n");
    }
}
