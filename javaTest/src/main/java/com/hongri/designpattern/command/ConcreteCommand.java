package com.hongri.designpattern.command;

/**
 * ConcreteCommand角色：
 * 命令接口实现对象
 */
public class ConcreteCommand implements Command {

    /**
     * 持有一个接受者Receiver的引用，绑定一个特定的操作
     */
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.action();
    }

    @Override
    public void unDo() {
        receiver.unAction();
    }
}
