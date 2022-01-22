package com.hongri.designpattern.command;

/** Command角色：
 *  命令的接口，声明执行的方法。
 */
public interface Command {
    /**
     * 执行
     */
    void execute();

    /**
     * 撤销
     */
    void unDo();
}
