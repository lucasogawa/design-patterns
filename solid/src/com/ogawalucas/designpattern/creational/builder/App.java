package com.ogawalucas.designpattern.creational.builder;

public class App {

	public static void main(String[] args) {
		System.out.println(new Student.Builder("Name", "University").setAge(1).build());
	}
}
