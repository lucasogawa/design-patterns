package com.ogawalucas.designpattern.structural.decorator;

public class App {

    public static void main(String[] args) {
        var milkWith2Sugars = new Sugar(new Sugar(new Milk(new PlainBeverage())));

        System.out.println(milkWith2Sugars.getDescription());
    }
}
