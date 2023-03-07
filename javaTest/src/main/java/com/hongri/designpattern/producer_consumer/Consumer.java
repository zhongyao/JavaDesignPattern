package com.hongri.designpattern.producer_consumer;

/**
 * 消费者
 */
public class Consumer implements Runnable{
    private String name;
    private SyncStack stack;

    public Consumer(String name, SyncStack stack) {
        this.name = name;
        this.stack = stack;
    }

    @Override
    public void run() {
        while (true) {
            try {
                Thread.sleep(3000);
                int val = stack.pop(name);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
