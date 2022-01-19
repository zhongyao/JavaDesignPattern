package com.hongri.designpattern.producer_consumer;

/**
 * 仓库【即共享数据区域】
 */
public class SyncStack {

    private String[] strArray = new String[10];

    private int index;

    /**
     * 供生产者调用
     *
     * @param str
     */
    public synchronized void push(String str) {
        if (index == strArray.length) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //唤醒在此对象监视器上等待的单个线程
        notify();
        strArray[index] = str;
        index++;
    }

    /**
     * 供消费者调用
     *
     * @return
     */
    public synchronized String pop() {
        if (index == 0) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        notify();
        index--;
        return strArray[index];
    }

    /**
     * 定义一个返回值为数组的方法,返回的是一个String[]引用
     */
    public String[] getStrArray() {
        return strArray;
    }
}
