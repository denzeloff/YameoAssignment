package pl.yameo.internship.assignment.model;

import pl.yameo.internship.assignment.service.ReaderService;

import java.util.Arrays;
import java.util.List;

public class Trapeze implements Shape {

    private double longerBase = 0.0;
    private double shorterBase = 0.0;
    private double edgeC = 0.0;
    private double edgeD = 0.0;
    private double height = 0.0;
    private static final String SHAPE_NAME = "Trapeze";

    public Trapeze(double longerBase, double shorterBase, double edgeC, double edgeD, double height) {
        this.longerBase = longerBase;
        this.shorterBase = shorterBase;
        this.edgeC = edgeC;
        this.edgeD = edgeD;
        this.height = height;
    }

    public void setLongerBase(double longerBase) {
        this.longerBase = longerBase;
    }

    public void setShorterBase(double shorterBase) {
        this.shorterBase = shorterBase;
    }

    public void setEdgeC(double edgeC) {
        this.edgeC = edgeC;
    }

    public void setEdgeD(double edgeD) {
        this.edgeD = edgeD;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public String getName() {
        return SHAPE_NAME;
    }

    @Override
    public final List<Double> listDimensions() {
        return Arrays.asList(longerBase, shorterBase, edgeC, edgeD, height);
    }

    @Override
    public final double calculateArea() {
        return ((longerBase + shorterBase) / 2) * height;
    }

    @Override
    public final double calculatePerimeter() {
        return longerBase + shorterBase + edgeC + edgeD;
    }

    @Override
    public final void modify() {
        System.out.println("Please provide two base, two edge and height lengths:");
        setLongerBase(ReaderService.INSTANCE.readDouble());
        setShorterBase(ReaderService.INSTANCE.readDouble());
        setEdgeC(ReaderService.INSTANCE.readDouble());
        setEdgeD(ReaderService.INSTANCE.readDouble());
        setHeight(ReaderService.INSTANCE.readDouble());
    }
}
