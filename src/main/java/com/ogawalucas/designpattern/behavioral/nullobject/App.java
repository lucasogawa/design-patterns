package com.ogawalucas.designpattern.behavioral.nullobject;

public class App {

    public static void main(String[] args) {
        var customerFactory = new CustomerFactory();

        System.out.println(customerFactory.getCustomer("Joe").getPerson());
        System.out.println(customerFactory.getCustomer("Joel").getPerson());
        System.out.println(customerFactory.getCustomer("Daniela").getPerson());
        System.out.println(customerFactory.getCustomer("Adam").getPerson());
    }
}
