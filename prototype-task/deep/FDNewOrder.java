package com.gupaoedu.vip.pattern.selfprototype.deep;


public class FDNewOrder implements Cloneable {

    private FDOrder fOrder;

    public FDOrder getfOrder() {
        return fOrder;
    }

    public void setfOrder(FDOrder fOrder) {
        this.fOrder = fOrder;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {

        FDNewOrder copy = (FDNewOrder)super.clone();
        copy.fOrder = (FDOrder) this.fOrder.clone();

        return  copy;
    }

}
