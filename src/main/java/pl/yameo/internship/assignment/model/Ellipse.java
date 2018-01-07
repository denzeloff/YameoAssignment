package pl.yameo.internship.assignment.model;

import pl.yameo.internship.assignment.service.ReaderService;

import java.util.Arrays;
import java.util.List;


public class Ellipse implements Shape {

    private double semiMajorAxis = 0.0;
    private double semiMinorAxis = 0.0;
    private static final String SHAPE_NAME = "Ellipse";

    public Ellipse(double semiMajorAxis, double semiMinorAxis) {
        this.semiMajorAxis = semiMajorAxis;
        this.semiMinorAxis = semiMinorAxis;
    }

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }

    public void setSemiMinorAxis(double semiMinorAxis) {
        this.semiMinorAxis = semiMinorAxis;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    public final List<Double> listDimensions() {
        return Arrays.asList(semiMajorAxis, semiMinorAxis);
    }

    @Override
    public final double calculateArea() {
        return Math.PI * semiMajorAxis * semiMinorAxis;
    }

    @Override
    public final double calculatePerimeter() {
        return Math.PI * (3 * (semiMajorAxis + semiMinorAxis) / 2 - Math.sqrt(semiMajorAxis * semiMinorAxis));
    }

    @Override
    public final void modify() {
        System.out.println("Please provide two semi-axis lengths (major, minor):");
        setSemiMajorAxis(ReaderService.INSTANCE.readDouble());
        setSemiMinorAxis(ReaderService.INSTANCE.readDouble());
    }

}
