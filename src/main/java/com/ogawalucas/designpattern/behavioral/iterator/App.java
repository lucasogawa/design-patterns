package com.ogawalucas.designpattern.behavioral.iterator;

public class App {

    public static void main(String[] args) {
        var nameRepository = new NameRepository();

        for (var iter = nameRepository.getIterator(); iter.hasNext(); ) {
            var name = (String) iter.next();
            System.out.println(name);
        }
    }
}
