package com.ogawalucas.designpattern.structural.decorator;

public class PlainBeverage implements Beverage {

    @Override
    public int getCost() {
        return 5;
    }

    @Override
    public String getDescription() {
        return "";
    }
}
