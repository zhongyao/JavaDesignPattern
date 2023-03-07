package com.hongri.designpattern.producer_consumer;

import java.util.Random;

/**
 * 生产者
 */
public class Producer implements Runnable {
    private String name;
    private SyncStack stack;

    public Producer(String name, SyncStack stack) {
        this.name = name;
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            int value = new Random().nextInt(100);
            stack.push(name, value);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
