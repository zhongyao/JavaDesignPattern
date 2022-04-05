package com.hongri.designpattern.create;

/**
 * @author：hongri
 * @date：4/5/22
 * @description：Builder具体实现类
 */
public class ComputerBuilder extends Builder {

    private Computer computer = new Computer();

    @Override
    public void buildCpu(String cpu) {
        computer.setCpu(cpu);
    }

    @Override
    public void buildRam(String ram) {
        computer.setRam(ram);
    }

    @Override
    public void buildMainBoard(String mainBoard) {
        computer.setMainBoard(mainBoard);
    }

    @Override
    public Computer create() {
        return computer;
    }
}
