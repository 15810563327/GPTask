package com.gupaoedu.vip.pattern.selfprototype.simple;

public class FOrder implements IClone {

    private long Id;
    private String name;
    private Goods goods;

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

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }

    public IClone clone() {
        FOrder order1 = new FOrder();
        order1.setId(this.Id);
        order1.setName(this.name);
        order1.setGoods(this.goods);
        return order1;
    }
}
