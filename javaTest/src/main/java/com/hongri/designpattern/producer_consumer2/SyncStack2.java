package com.hongri.designpattern.producer_consumer2;

import java.util.concurrent.ArrayBlockingQueue;

/**
 * 仓库【即共享数据区域】
 */
public class SyncStack2 {
    private final ArrayBlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(10);

    /**
     * 供生产者调用
     *
     * @param value
     */
    public synchronized void push(String producerName, int value) {
        blockingQueue.add(value);
    }

    /**
     * 供消费者调用
     *
     * @return
     */
    public synchronized int pop(String consumerName) {
        int value;
        try {
            value = blockingQueue.take();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        return value;
    }
}
