package com.hongri.designpattern.create;

/**
 * @author：hongri
 * @date：4/5/22
 * @description：创建产品类
 */
public class Computer {
    private String mCpu;
    private String mRam;
    private String mMainBoard;

    public String getCpu() {
        return mCpu;
    }

    public void setCpu(String mCpu) {
        this.mCpu = mCpu;
    }

    public String getRam() {
        return mRam;
    }

    public void setRam(String mRam) {
        this.mRam = mRam;
    }

    public String getMainBoard() {
        return mMainBoard;
    }

    public void setMainBoard(String mMainBoard) {
        this.mMainBoard = mMainBoard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "mCpu='" + mCpu + '\'' +
                ", mRam='" + mRam + '\'' +
                ", mMainBoard='" + mMainBoard + '\'' +
                '}';
    }
}
