package pl.yameo.internship.assignment.model;


import pl.yameo.internship.assignment.service.ReaderService;

import java.util.Arrays;
import java.util.List;


public class Triangle implements Shape {

    private double edgeA = 0.0;
    private double edgeB = 0.0;
    private double edgeC = 0.0;
    private static final String SHAPE_NAME = "Triangle";

    public Triangle(double edgeA, double edgeB, double edgeC) throws IllegalArgumentException {
        this.edgeA = edgeA;
        this.edgeB = edgeB;
        this.edgeC = edgeC;
        if (!isPossible()) {
            throw new IllegalArgumentException("We cannot create a triangle");
        }
    }

    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    public void setEdgeB(double edgeB) {
        this.edgeB = edgeB;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }

    public boolean isPossible() {
        return (edgeA + edgeB > edgeC && edgeA + edgeC > edgeB && edgeB + edgeC > edgeA);
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    public final List<Double> listDimensions() {
        return Arrays.asList(edgeA, edgeB, edgeC);
    }

    @Override
    public final double calculateArea() {
        double halfPerimeter = calculatePerimeter() / 2;
        return Math.sqrt(halfPerimeter * (halfPerimeter - edgeA) * (halfPerimeter - edgeB) * (halfPerimeter - edgeC));
    }

    @Override
    public final double calculatePerimeter() {
        return edgeA + edgeB + edgeC;
    }

    @Override
    public final void modify() {
        System.out.println("Please provide three edge lengths:");
        setEdgeA(ReaderService.INSTANCE.readDouble());
        setEdgeB(ReaderService.INSTANCE.readDouble());
        setEdgeC(ReaderService.INSTANCE.readDouble());
    }

}
