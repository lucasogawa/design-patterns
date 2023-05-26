package com.ogawalucas.designpattern.behavioral.visitor;

interface Visitor {
    void visitCircle(Circle circle);

    void visitTriangle(Triangle triangle);

    void visitRectangle(Rectangle rectangle);
}
