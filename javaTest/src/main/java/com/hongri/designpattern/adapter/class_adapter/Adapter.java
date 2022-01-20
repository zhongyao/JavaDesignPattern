package com.hongri.designpattern.adapter.class_adapter;

import com.hongri.designpattern.adapter.Adaptee;
import com.hongri.designpattern.adapter.Target;

/**
 * 适配器类:
 * 继承了被适配类，同时实现标准接口
 */
public class Adapter extends Adaptee implements Target {
    @Override
    public void request() {
        super.specificRequest();
    }
}
