package com.hongri.designpattern.command;

/**
 * Invoker角色：
 * 要求该命令执行这个请求。
 */
public class Invoker {

    /**
     * 调用者持有一个命令对象
     */
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public Command getCommand() {
        return command;
    }

    public void executeCommand() {
        command.execute();
    }

    public void unExecuteCommand() {
        command.unDo();
    }

}
