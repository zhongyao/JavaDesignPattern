package com.hongri.designpattern.producer_consumer;

/**
 * 生产者
 */
public class Producer implements Runnable{

    private SyncStack stack;

    public Producer(SyncStack stack){
        this.stack = stack;
    }

    @Override
    public void run() {
        for (int i = 0; i < stack.getStrArray().length; i++) {
            String producer = "产品" + i;
            stack.push(producer);
            System.out.println("生产了 ---> " + producer);

            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
