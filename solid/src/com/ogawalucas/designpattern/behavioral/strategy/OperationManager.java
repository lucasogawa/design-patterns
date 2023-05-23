package com.ogawalucas.designpattern.behavioral.strategy;

public class OperationManager {

    private Operation strategy;

    public void setStrategy(Operation strategy) {
        this.strategy = strategy;
    }

    public void execute(int num1, int num2) {
        this.strategy.execute(num1, num2);
    }
}
