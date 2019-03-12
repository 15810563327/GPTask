package com.gupaoedu.vip.pattern.selfprototype.deepseri;


public class QSDeepCloneTest {

    public static void main(String[] args) {

        FDSOrder fOrder = new FDSOrder();
        fOrder.setDGoods(new DSGoods());
        fOrder.setId(1001);
        fOrder.setName("大哥大");
        fOrder.getDGoods().setName("旧商品");

        try {
            FDSOrder fCloneOrder1 = (FDSOrder) fOrder.clone();
            fCloneOrder1.setId(1002);
            fCloneOrder1.setName("手机");
            fCloneOrder1.getDGoods().setName("新商品");

            System.out.println("原订单的ID=克隆订单的ID："+fOrder.getId()+"="+fCloneOrder1.getId());

            System.out.println("原订单的名称=克隆订单的名称："+fOrder.getName()+"="+fCloneOrder1.getName());

            System.out.println("原订单中的商品=克隆订单中的商品："+fOrder.getDGoods().getName()+"="+fCloneOrder1.getDGoods().getName());


        }catch (Exception e){
            e.printStackTrace();
        }


    }
}
