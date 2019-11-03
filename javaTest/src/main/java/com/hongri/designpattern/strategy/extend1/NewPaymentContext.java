package com.hongri.designpattern.strategy.extend1;

import com.hongri.designpattern.strategy.IPaymentStrategy;
import com.hongri.designpattern.strategy.PaymentContext;

/**
 * 新扩展的支付策略的上下文
 * @author zhongyao
 * @date 2019-11-03
 */
public class NewPaymentContext extends PaymentContext {
    private String mAccount;

    /**
     * 构造方法，新增了一个账户(account)参数
     * @param userName
     * @param money
     * @param account
     * @param paymentStrategy
     */
    public NewPaymentContext(String userName, double money, String account,
                             IPaymentStrategy paymentStrategy) {
        super(userName, money, paymentStrategy);
        mAccount = account;
    }

    public String getAccount() {
        return mAccount;
    }
}
