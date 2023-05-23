package com.ogawalucas.designpattern.behavioral.observer.example2;

public interface Subject {
	void addObserver(Observer o);

	void notifyAllObserver();
}
