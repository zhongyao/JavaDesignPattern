package com.hongri.designpattern;

import com.hongri.designpattern.producer_consumer.Consumer;
import com.hongri.designpattern.producer_consumer.Producer;
import com.hongri.designpattern.producer_consumer.SyncStack;
import com.hongri.designpattern.producer_consumer2.SyncStack2;

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
         * 建造者模式
         */
//        Builder builder = new ComputerBuilder();
//        Director director = new Director(builder);
//        //组装计算机
//        Computer computer = director.createComputer("Intel i7", "华硕", "kingston");
//        System.out.println("computer:" + computer);

        /**
         * 模板方法模式
         */
//        ZhangWuJi zhangWuJi = new ZhangWuJi();
//        zhangWuJi.fighting();
//
//        ZhangSanFeng zhangSanFeng = new ZhangSanFeng();
//        zhangSanFeng.fighting();

        /**
         * 适配器模式
         */
        //类适配器
//        Target adapter = new Adapter();
//        adapter.request();

        //对象适配器
//        Adaptee adaptee = new Adaptee();
//        Target adapter = new Adapter(adaptee);
//        adapter.request();


        /**
         * 生产者--消费者模型【不在23种设计模式之列】
         */
        SyncStack stack = new SyncStack();
        Producer producer1 = new Producer("Producer1", stack);
        Producer producer2 = new Producer("Producer2", stack);
        Producer producer3 = new Producer("Producer3", stack);

        Consumer consumer1 = new Consumer("Consumer1", stack);
        Consumer consumer2 = new Consumer("Consumer2", stack);
        Consumer consumer3 = new Consumer("Consumer3", stack);

        new Thread(producer1).start();
        new Thread(producer2).start();
        new Thread(producer3).start();
        new Thread(consumer1).start();
        new Thread(consumer2).start();
        new Thread(consumer3).start();

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

//        IPaymentStrategy rmbCashStrategy = new RMBCashStrategy();
//        PaymentContext paymentContext1 = new PaymentContext("张三", 6000.0, rmbCashStrategy);
//        paymentContext1.payNow();
//
//        IPaymentStrategy dollarCashStrategy = new DollarCashStrategy();
//        PaymentContext paymentContext2 = new PaymentContext("Jack", 8000.0, dollarCashStrategy);
//        paymentContext2.payNow();
//
//        IPaymentStrategy creditCardStrategy = new CreditCardStrategy();
//        NewPaymentContext newPaymentContext = new NewPaymentContext("王五", 9000.0, "8384894893",
//            creditCardStrategy);
//        newPaymentContext.payNow();
//
//        IPaymentStrategy creditCardStrategy2 = new CreditCardStrategy2("8384894893");
//        PaymentContext paymentContext3 = new PaymentContext("王五", 9000.0, creditCardStrategy2);
//        paymentContext3.payNow();

    }
}
