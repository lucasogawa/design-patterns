package com.ogawalucas.designpattern.behavioral.observer.example1;

public interface Subject {
	void addObserver(Observer o);

	void removeObserver(Observer o);

	void notifyAllObservers();
}
