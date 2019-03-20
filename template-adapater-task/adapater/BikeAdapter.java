package com.gupaoedu.vip.pattern.adapater;

public class BikeAdapter implements IDriverAdapter {

    public boolean support(Object adapter) {
        return adapter instanceof BikeAdapter;
    }

    public void driverMode() {
        System.out.println("出行方式：骑车出行");
    }
}
