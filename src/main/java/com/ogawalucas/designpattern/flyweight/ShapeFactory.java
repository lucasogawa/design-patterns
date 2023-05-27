package com.ogawalucas.designpattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ShapeFactory {

    private Map<String, Shape> shapes;

    public ShapeFactory() {
        shapes = new HashMap<>();
    }

    public Shape getShape(String color) {
        if (shapes.containsKey(color)) {
            return shapes.get(color);
        }

        System.out.println("Creating a new rectangle...");
        Shape shape = new Rectangle(color);
        shapes.put(color, shape);
        return shape;
    }
}
