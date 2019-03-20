package com.gupaoedu.vip.pattern.adapater;

public class CarAdapter implements IDriverAdapter {


    public boolean support(Object adapter) {
        return adapter instanceof CarAdapter;
    }

    public void driverMode() {
        System.out.println("出行方式：自驾出行");
    }
}
