package com.ogawalucas.solid.dependencyinversion;

public class App {

	public static void main(String[] args) {
		var controller = new DatabaseController(new MySQLDatabase());
		controller.connect();
		controller.disconnect();

		controller = new DatabaseController(new OracleDatabase());
		controller.connect();
		controller.disconnect();
	}
}
