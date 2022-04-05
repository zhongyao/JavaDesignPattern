package com.hongri.designpattern.create;

/**
 * @author：hongri
 * @date：4/5/22
 * @description：创建Builder类，规范产品的组建
 */
public abstract class Builder {
    public abstract void buildCpu(String cpu);
    public abstract void buildRam(String ram);
    public abstract void buildMainBoard(String mainBoard);
    public abstract Computer create();
}
