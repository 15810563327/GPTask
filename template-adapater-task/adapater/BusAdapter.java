package com.gupaoedu.vip.pattern.adapater;

public class BusAdapter implements IDriverAdapter {
    public boolean support(Object adapter) {
        return adapter instanceof BusAdapter;
    }

    public void driverMode() {
        System.out.println("出行方式：公交出行");
    }
}
