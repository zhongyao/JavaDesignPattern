package com.hongri.designpattern.producer_consumer;

/**
 * 消费者
 */
public class Consumer implements Runnable{

    private SyncStack stack;

    public Consumer(SyncStack stack) {
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 0; i < stack.getStrArray().length; i++) {
            String consumer = stack.pop();
            System.out.println("消费了 ---> " + consumer);

            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
