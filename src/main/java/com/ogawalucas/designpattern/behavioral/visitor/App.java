package com.ogawalucas.designpattern.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Circle());
        shapes.add(new Triangle());
        shapes.add(new Rectangle());

        var save = new SaveCSVFile();

        for (Shape shape : shapes) {
            shape.accept(save);
        }
    }
}
