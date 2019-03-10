package com.edu.study.factory.abstracts;

public class AbstractTest {

    public static void main(String[] args) {
        AbstractFactory abstractFactory = new DefaultFactory();
        String make = abstractFactory.getAcer().makeComputer();
        String sell = abstractFactory.getAcer().sellComputer();
        System.out.println(make+"="+sell);
    }
}
