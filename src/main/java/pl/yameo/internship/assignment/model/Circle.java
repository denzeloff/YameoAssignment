package pl.yameo.internship.assignment.model;

import pl.yameo.internship.assignment.service.ReaderService;

import java.util.Collections;
import java.util.List;

public class Circle implements Shape {

    private static final String SHAPE_NAME = "Circle";
    private double radius = 0.0;

    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    public final List<Double> listDimensions() {
        return Collections.singletonList(radius);
    }

    @Override
    public final double calculateArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public final double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public final void modify() {
        System.out.println("Please provide the radius for the circle:");
        setRadius(ReaderService.INSTANCE.readDouble());
    }
    
}
