package com.ogawalucas.designpattern.creational.abstractfactory;

public class ElectricToyota implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling a electric Toyota...");
    }
}
