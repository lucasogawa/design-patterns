package com.ogawalucas.designpattern.creational.abstractfactory;

public class App {

	public static void main(String[] args) {
		var factory = FactoryProducer.getFactory("ELECTRIC");
		factory.getCar("FORD").assemble();
		factory.getCar("TOYOTA").assemble();

		factory = FactoryProducer.getFactory("PETROL");
		factory.getCar("FORD").assemble();
		factory.getCar("TOYOTA").assemble();
	}
}
