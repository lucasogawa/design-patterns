package com.ogawalucas.designpattern.behavioral.observer.example2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StockExchange implements Subject {

    private float price = 100;
    private Random random;
    private List<Observer> observers;

    public StockExchange() {
        random = new Random();
        observers = new ArrayList<>();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyAllObserver() {
        for (Observer observer : observers)
            observer.update(price);
    }

    public void start() {
        while (true) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            price = price + 2 * random.nextFloat() - 1;
            notifyAllObserver();

			System.out.println(price);
        }
    }
}
