package com.ogawalucas.solid.singleresponsability;

public class App {

    public static void main(String[] args) {
        var pair = InputProcessor.process();

        if (!ViolationChecker.isValid(pair)) {
            System.out.println("One of the input is invalid...");
            return;
        }

        int firstInteger = Integer.parseInt(pair.first());
        int secondInteger = Integer.parseInt(pair.second());
        int result = Operation.execute(firstInteger, secondInteger);

        System.out.println("The result is: " + result);
    }
}
