package com.edu.study.factory.abstracts;

public class Acer implements IAcerComputer {
    @Override
    public String makeComputer() {
        return "我是宏碁电脑厂，生产宏碁电脑";
    }

    @Override
    public String sellComputer() {
        return "我是宏碁电脑厂，卖宏碁电脑";
    }
}
