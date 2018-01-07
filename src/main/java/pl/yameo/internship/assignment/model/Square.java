package pl.yameo.internship.assignment.model;

import pl.yameo.internship.assignment.service.ReaderService;

import java.util.Collections;
import java.util.List;

public class Square implements Shape {

    private double edgeA = 0.0;
    private static final String SHAPE_NAME = "Square";

    public Square(double edgeA) {
        this.edgeA=edgeA;
    }
    public void setEdgeA(double edgeA) {
        this.edgeA = edgeA;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    public final List<Double> listDimensions() {
        return Collections.singletonList(edgeA);
    }

    @Override
    public final double calculateArea() {
        return edgeA*edgeA;
    }

    @Override
    public final double calculatePerimeter() {
        return 4*edgeA;
    }

    @Override
    public final void modify() {
        System.out.println("Please provide the edge length:");
        setEdgeA(ReaderService.INSTANCE.readDouble());
    }

}
