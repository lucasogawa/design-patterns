package com.ogawalucas.solid.liskov;

public class App {

	public static void main(String[] args) {
		var petrolCar = new PetrolCar("Toyota", 10);
		petrolCar.speedUp();
		petrolCar.slowDown();
		petrolCar.fuel();

		var eletricCar = new ElectricCar("Tesla", 1);
		eletricCar.speedUp();
		eletricCar.slowDown();
		eletricCar.fuel();
	}
}
