package com.edu.study.factory.simple;

public class SimpleFactory {

    public ICar getCar(String brand){
        if ("BWM".equals(brand)){
            return new BWMCar();
        }else if ("BYD".equals(brand)){
            return new BYDCar();
        }else {
            System.out.println("本4S店不卖其他品牌车！");
            return null;
        }

    }
}
