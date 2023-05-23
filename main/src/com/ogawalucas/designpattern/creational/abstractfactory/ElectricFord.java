package com.ogawalucas.designpattern.creational.abstractfactory;

public class ElectricFord implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a electric Ford...");
    }
}
