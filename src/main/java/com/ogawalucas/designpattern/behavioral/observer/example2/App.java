package com.ogawalucas.designpattern.behavioral.observer.example2;

public class App {

	public static void main(String[] args) {
		var stockExchange = new StockExchange();

		stockExchange.addObserver(new BuyStockListener());
		stockExchange.addObserver(new SellStockListener());

		stockExchange.start();
	}
}
