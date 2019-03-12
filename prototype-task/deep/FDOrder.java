package com.gupaoedu.vip.pattern.selfprototype.deep;


public class FDOrder implements Cloneable {

    private long Id;
    private String name;
    private DGoods goods;

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DGoods getDGoods() {
        return goods;
    }

    public void setDGoods(DGoods goods) {
        this.goods = goods;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {

        FDOrder fdOrder = (FDOrder) super.clone();
        fdOrder.goods = (DGoods) goods.clone();
        return fdOrder;
    }

}
