package com.gupaoedu.vip.pattern.selfprototype.deep;



public class QDeepCloneTest {

    public static void main(String[] args) {

        FDNewOrder fCloneOrder = new FDNewOrder();
        fCloneOrder.setfOrder(new FDOrder());
        fCloneOrder.getfOrder().setId(1001);
        fCloneOrder.getfOrder().setName("大哥大");
        fCloneOrder.getfOrder().setDGoods(new DGoods());
        fCloneOrder.getfOrder().getDGoods().setName("旧商品");

        try {
            FDNewOrder fCloneOrder1 = (FDNewOrder) fCloneOrder.clone();
            fCloneOrder1.getfOrder().setId(1002);
            fCloneOrder1.getfOrder().setName("手机");
            fCloneOrder1.getfOrder().getDGoods().setName("新商品");


            System.out.println("原订单的ID=克隆订单的ID："+fCloneOrder.getfOrder().getId()+"="+fCloneOrder1.getfOrder().getId());

            System.out.println("原订单的名称=克隆订单的名称："+fCloneOrder.getfOrder().getName()+"="+fCloneOrder1.getfOrder().getName());

            System.out.println("原订单中的商品=克隆订单中的商品："+fCloneOrder.getfOrder().getDGoods().getName()+"="+fCloneOrder1.getfOrder().getDGoods().getName());


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
