package com.hongri.designpattern.strategy.extend2;

import com.hongri.designpattern.strategy.IPaymentStrategy;
import com.hongri.designpattern.strategy.PaymentContext;

/**
 * 信用卡支付策略实现类2
 *
 * @author zhongyao
 * @date 2019-11-03
 */
public class CreditCardStrategy2 implements IPaymentStrategy {

    private String mAccount;

    public CreditCardStrategy2(String account) {
        mAccount = account;
    }

    public String getAccount() {
        return mAccount;
    }

    @Override
    public void pay(PaymentContext context) {
        System.out.println(
            "支付方式：信用卡支付2 " + "收款人---姓名：" + context.getUserName() + " 账号："
                + getAccount() + " 工资：" + context.getMoney()
                + "\n");
    }
}
