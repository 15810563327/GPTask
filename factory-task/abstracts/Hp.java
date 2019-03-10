package com.edu.study.factory.abstracts;

public class Hp implements IHpComputer {
    @Override
    public String makeComputer() {
        return "我是惠普电脑厂，生产惠普电脑";
    }

    @Override
    public String sellComputer() {
        return "我是惠普电脑厂，卖惠普电脑";
    }
}
