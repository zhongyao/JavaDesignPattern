package com.hongri.designpattern.producer_consumer;

import java.util.LinkedList;

/**
 * 仓库【即共享数据区域】
 */
public class SyncStack {
    LinkedList<Integer> list = new LinkedList<>();
    int capacity = 10;
    public volatile int index;

    /**
     * 供生产者调用
     *
     * @param value
     */
    public synchronized void push(String producerName, int value) {
        while (list.size() >= capacity) {
            try {
                System.out.println("仓库已满 ---> 生产者--进入wait状态");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        //没有满，则继续produce
        System.out.println("生产者--" + producerName + "--生产了:" + value);
        list.add(value);
        //唤醒其他所有处于wait()的线程，包括消费者和生产者
        notifyAll();
    }

    /**
     * 供消费者调用
     *
     * @return
     */
    public synchronized int pop(String consumerName) {
        int val = 0;
        while (list.size() == 0) {
            try {
                System.out.println(" 仓库无货 ---> 消费者--进入wait状态");
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //如果有数据，继续consume
        val = list.removeFirst();
        System.out.println("   消费者------" + consumerName + "--消费了:" + val);
        notifyAll();
        return val;
    }
}
