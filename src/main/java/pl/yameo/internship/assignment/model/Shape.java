package pl.yameo.internship.assignment.model;

import java.util.List;

public interface Shape {

    String getName();

    List<Double> listDimensions();

    double calculateArea();

    double calculatePerimeter();

    void modify();

}
