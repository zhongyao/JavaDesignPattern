package com.hongri.designpattern;

import com.hongri.designpattern.strategy.extend1.CreditCardStrategy;
import com.hongri.designpattern.strategy.DollarCashStrategy;
import com.hongri.designpattern.strategy.IPaymentStrategy;
import com.hongri.designpattern.strategy.extend1.NewPaymentContext;
import com.hongri.designpattern.strategy.PaymentContext;
import com.hongri.designpattern.strategy.RMBCashStrategy;
import com.hongri.designpattern.strategy.extend2.CreditCardStrategy2;

/**
 * @author hongri
 *
 * 参考：
 * https://blog.csdn.net/jason0539/article/details/44956775
 * https://www.cnblogs.com/pony1223/p/7608955.html
 * http://www.cnblogs.com/pony1223/p/7594803.html
 */
public class JavaDesignPattern {
    public static void main(String[] args) {

        /**
         * 静态代理测试
         */
        //实例化目标对象
        //RealObject realObject = new RealObject();
        ////将目标对象引用传递给代理对象
        //AbstractObject proxyObject = new ProxyObject(realObject);
        ////代理对象调动起自身的代理方法，代理方法内部会调用目标方法。
        //proxyObject.operation();

        /**
         * 动态代理测试
         */
        //实例化目标对象
        //RealSubject realSubject = new RealSubject();
        ////将目标对象引用传至调用处理器类中
        //ProxyHandler proxyHandler = new ProxyHandler(realSubject);
        ////动态生成代理
        //Subject proxySubject = (Subject)Proxy.newProxyInstance(RealSubject.class.getClassLoader(),
        //    RealSubject.class.getInterfaces(),
        //    proxyHandler);
        ////调用代理方法
        //proxySubject.request();

        /**
         * 测试简单工厂
         */
        //Car carBMW = CarFactory.createCar(CarTypeDef.CAR_TYPE_BMW_X5);
        //carBMW.drive();
        //
        //Car carBenz = CarFactory.createCar(CarTypeDef.CAR_TYPE_BMW_X7);
        //carBenz.drive();

        /**
         * 测试工厂模式
         */
        //BMWCarFactory bmwCarFactory = new BMWCarFactory();
        //bmwCarFactory.createCar().drive();
        //
        //BenzCarFactory benzCarFactory = new BenzCarFactory();
        //benzCarFactory.createCar().drive();

        /**
         * 测试抽象工厂模式
         */
        //ICarFactory bmwCarFactory = new BMWCarFactory();
        //bmwCarFactory.createEngine().rotate();
        //bmwCarFactory.createAirConditioner().blow();
        //
        //ICarFactory benzCarFactory = new BenzCarFactory();
        //benzCarFactory.createEngine().rotate();
        //benzCarFactory.createAirConditioner().blow();

        /**
         * 策略模式测试一【】
         */

        IPaymentStrategy rmbCashStrategy = new RMBCashStrategy();
        PaymentContext paymentContext1 = new PaymentContext("张三", 6000.0, rmbCashStrategy);
        paymentContext1.payNow();

        IPaymentStrategy dollarCashStrategy = new DollarCashStrategy();
        PaymentContext paymentContext2 = new PaymentContext("Jack", 8000.0, dollarCashStrategy);
        paymentContext2.payNow();

        IPaymentStrategy creditCardStrategy = new CreditCardStrategy();
        NewPaymentContext newPaymentContext = new NewPaymentContext("王五", 9000.0, "8384894893",
            creditCardStrategy);
        newPaymentContext.payNow();

        IPaymentStrategy creditCardStrategy2 = new CreditCardStrategy2("8384894893");
        PaymentContext paymentContext3 = new PaymentContext("王五", 9000.0, creditCardStrategy2);
        paymentContext3.payNow();

    }
}
