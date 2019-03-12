package com.gupaoedu.vip.pattern.selfprototype.simple;

public class QSimplCloneTest {

    public static void main(String[] args) {
        FOrder order = new FOrder();
        Goods goods = order.getGoods();

        FClientClone fClientClone = new FClientClone(order);
        FOrder orderClone = (FOrder) fClientClone.clientClone();
        Goods goodsClone = orderClone.getGoods();

        System.out.println(goods == goodsClone);

    }
}
