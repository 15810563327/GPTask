package com.edu.study.factory.func;

public class HuaweiFactory implements ISellMobile{

    @Override
    public IMobile sellMobile() {
        return new HuaweiMobile();
    }
}
