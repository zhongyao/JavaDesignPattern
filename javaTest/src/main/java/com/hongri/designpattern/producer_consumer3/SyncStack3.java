package com.hongri.designpattern.producer_consumer3;

import java.util.LinkedList;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 仓库【即共享数据区域】
 */
public class SyncStack3 {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 10;
    //一把锁
    private final ReentrantLock lock = new ReentrantLock();
    //两个条件
    private final Condition producerCondition = lock.newCondition();
    private final Condition consumerCondition = lock.newCondition();

    /**
     * 供生产者调用
     *
     * @param value
     */
    public synchronized void push(String producerName, int value) {
        try {
            lock.lockInterruptibly();//获取锁
            while (list.size() >= capacity) {
                try {
                    System.out.println("仓库已满 ---> 生产者--进入wait状态");
                    producerCondition.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //没有满，则继续produce
            System.out.println("生产者--" + producerName + "--生产了:" + value);
            list.add(value);
            //唤醒在consumerCondition等待的线程
            consumerCondition.signalAll();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //确保释放锁
            lock.unlock();
        }
    }

    /**
     * 供消费者调用
     *
     * @return
     */
    public synchronized int pop(String consumerName) {
        try {
            lock.lockInterruptibly();
            int val = 0;
            while (list.size() == 0) {
                try {
                    System.out.println(" 仓库无货 ---> 消费者--进入wait状态");
                    consumerCondition.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            //如果有数据，继续consume
            val = list.removeFirst();
            System.out.println("   消费者------" + consumerName + "--消费了:" + val);
            producerCondition.signalAll();
            return val;
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            //确保释放锁
            lock.unlock();
        }
    }
}
