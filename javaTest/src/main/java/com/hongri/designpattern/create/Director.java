package com.hongri.designpattern.create;

/**
 * @author：hongri
 * @date：4/5/22
 * @description：导演类 - 用来统一组装过程
 */
public class Director {
    Builder builder;
    public Director(Builder builder) {
        this.builder = builder;
    }

    public Computer createComputer(String cpu, String mainBoard, String ram) {
        builder.buildMainBoard(mainBoard);
        builder.buildCpu(cpu);
        builder.buildRam(ram);

        return builder.create();
    }
}
