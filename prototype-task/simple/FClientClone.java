package com.gupaoedu.vip.pattern.selfprototype.simple;


public class FClientClone {

    private IClone clone;

    public FClientClone(IClone clone){
        this.clone = clone;
    }

    public IClone clientClone() {
        return this.clone;
    }
}
