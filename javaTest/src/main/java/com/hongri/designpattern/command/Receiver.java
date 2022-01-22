package com.hongri.designpattern.command;

/**
 * Receiver角色：
 * 接收者，真正执行命令的对象。
 */
public class Receiver {

    public void action() {
        System.out.println("执行一个命令");
    }

    public void unAction() {
        System.out.println("撤销一个命令");
    }
}
