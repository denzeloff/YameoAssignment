package pl.yameo.internship.assignment.service;

import pl.yameo.internship.assignment.model.*;


public class ShapeFactory {
    public Shape getShape(Shapes shapesType) {
        switch (shapesType) {
            case ELLIPSE:
                System.out.println("Please provide two semi-axis lengths (major, minor):");
                return new Ellipse(ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble());
            case RECTANGLE:
                System.out.println("Please provide two edge lengths (height, width):");
                return new Rectangle(ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble());
            case CIRCLE:
                System.out.println("Please provide the radius for the circle:");
                return new Circle(ReaderService.INSTANCE.readDouble());
            case SQUARE:
                System.out.println("Please provide the edge length:");
                return new Square(ReaderService.INSTANCE.readDouble());
            case TRIANGLE:
                System.out.println("Please provide three edge lengths:");
                return new Triangle(ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble());
            case TRAPEZE:
                System.out.println("Please provide two base, two edge and height lengths:");
                return new Trapeze(ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble(), ReaderService.INSTANCE.readDouble());
        }
        return null;
    }

}