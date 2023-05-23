package com.ogawalucas.designpattern.behavioral.observer.example1;

public class App {

	public static void main(String[] args) {
		var station = new WeatherStation();
		var weatherObserver = new WeatherObserver(station);
		
		station.setHumidity(100);
		station.setPressure(200);
		station.setTemperature(300);
	}
}
