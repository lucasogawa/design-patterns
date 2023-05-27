package com.ogawalucas.designpattern.structural.facade;

public class App {

    public static void main(String[] args) {
        var manager = new SortingManager();

        manager.bubbleSort();
        manager.mergeSort();
        manager.heapSort();
    }
}
