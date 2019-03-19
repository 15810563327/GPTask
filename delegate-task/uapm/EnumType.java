package com.gupaoedu.vip.pattern.delegate.uapm;

public enum EnumType {

    LINE_NAME("line"),BAR_NAME("bar"),PIE_NAME("pie");

    private String name;

    EnumType(String name) {
       this.name = name;
    }

    public String getName(){
       return name;
    }
}
