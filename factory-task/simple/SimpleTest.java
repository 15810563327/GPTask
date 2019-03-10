package com.edu.study.factory.simple;

public class SimpleTest {

    public static void main(String[] args) {
        SimpleFactory simpleFactory = new SimpleFactory();
        String car = simpleFactory.getCar("BWM").makeCar();
        System.out.println(car);
    }
}
