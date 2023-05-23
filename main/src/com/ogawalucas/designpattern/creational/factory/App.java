package com.ogawalucas.designpattern.creational.factory;

public class App {

	public static void main(String[] args) {
		var animal = AnimalFactory.getAnimal(AnimalType.CAT);
		animal.eat();

		animal = AnimalFactory.getAnimal(AnimalType.DOG);
		animal.eat();

		animal = AnimalFactory.getAnimal(AnimalType.LION);
		animal.eat();

		animal = AnimalFactory.getAnimal(AnimalType.TIGER);
		animal.eat();
	}
}
