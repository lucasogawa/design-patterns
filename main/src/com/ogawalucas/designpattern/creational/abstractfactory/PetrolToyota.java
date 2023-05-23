package com.ogawalucas.designpattern.creational.abstractfactory;

public class PetrolToyota implements Car {

    @Override
    public void assemble() {
        System.out.println("Assembling an petrol Toyota...");
    }
}
