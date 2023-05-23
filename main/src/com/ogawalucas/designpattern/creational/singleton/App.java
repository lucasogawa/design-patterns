package com.ogawalucas.designpattern.creational.singleton;

public class App {

    public static void main(String[] args) {
		var dbc1 = DatabaseConnector.getInstance();
		var dbc2 = DatabaseConnector.getInstance();
		if (dbc1 == dbc2) {
			System.out.println("The objects DatabaseConnector are the same...");
		}

        var db1 = Database.INSTANCE;
        var db2 = Database.INSTANCE;
        if (db1 == db2) {
            System.out.println("The objects Database are the same...");
		}
	}
}
