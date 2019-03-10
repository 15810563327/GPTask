package com.edu.study.factory.func;

public class AppleFactory implements ISellMobile{

    @Override
    public IMobile sellMobile() {
        return  new AppleMobile();
    }
}
