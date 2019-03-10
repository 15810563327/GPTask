package com.edu.study.factory.func;

public class FuncTest {

    public static void main(String[] args) {
        ISellMobile iSellMobile = new AppleFactory();
        IMobile iMobile = iSellMobile.sellMobile();
        System.out.println(iMobile.makeMoblie());
    }
}
