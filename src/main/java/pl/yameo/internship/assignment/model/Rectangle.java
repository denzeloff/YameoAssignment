package pl.yameo.internship.assignment.model;


import pl.yameo.internship.assignment.service.ReaderService;

import java.util.Arrays;
import java.util.List;

public class Rectangle implements Shape {

    private double height = 0.0;
    private double width = 0.0;
    private static final String SHAPE_NAME = "Rectangle";

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    public final List<Double> listDimensions() {
        return Arrays.asList(height, width);
    }

    @Override
    public final double calculateArea() {
        return height * width;
    }

    @Override
    public final double calculatePerimeter() {
        return 2 * (height + width);
    }

    @Override
    public final void modify() {
        System.out.println("Please provide two edge lengths (height, width):");
        setHeight(ReaderService.INSTANCE.readDouble());
        setWidth(ReaderService.INSTANCE.readDouble());
    }


}
