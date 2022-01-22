package com.hongri.designpattern.command;

/**
 * Client角色：
 * 创建一个具体命令对象并设定它的接收者。
 */
public class Client {

    public static void main(String[] args) {
        //创建命令的接受者
        Receiver receiver = new Receiver();

        //创建命令对象，并设置它的接受者
        Command command = new ConcreteCommand(receiver);

        // 创建命令执行者，并将相应的命令作为参数传递给Invoker
        Invoker invoker = new Invoker();
        invoker.setCommand(command);

        // 命令执行
        invoker.executeCommand();
        invoker.unExecuteCommand();
    }
}
