package com.edu.study.factory.abstracts;

public class DefaultFactory extends AbstractFactory {
    @Override
    public IAcerComputer getAcer() {
        return new Acer();
    }

    @Override
    public IHpComputer getHp() {
        return new Hp();
    }
}
