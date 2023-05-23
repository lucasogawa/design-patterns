package com.ogawalucas.designpattern.behavioral.strategy;

public class App {

    public static void main(String[] args) {
        var manager = new OperationManager();

		manager.setStrategy(new Addition());
		manager.execute(10, 5);

        manager.setStrategy(new Division());
        manager.execute(10, 5);

        manager.setStrategy(new Multiplication());
        manager.execute(10, 5);

        manager.setStrategy(new Substraction());
        manager.execute(10, 5);
    }
}
