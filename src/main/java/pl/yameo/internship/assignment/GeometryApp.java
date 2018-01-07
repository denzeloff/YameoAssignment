package pl.yameo.internship.assignment;

import pl.yameo.internship.assignment.service.ReaderService;
import pl.yameo.internship.assignment.service.ShapesCreatorService;
import pl.yameo.internship.assignment.model.Shape;

import java.util.*;

public class GeometryApp {

    private List<Shape> shapes = new ArrayList<>();


    public void start() {
        boolean run = true;
        while (run) {
            run = run();
        }
    }

    private boolean run() {
        System.out.println("Choose action:");
        System.out.println("1) Create new shape");
        System.out.println("2) List existing model");
        System.out.println("3) Modify one of the model from the list");
        System.out.println("4) Remove shape from list");
        System.out.println("0) Exit");

        int option = ReaderService.INSTANCE.readInteger();
        switch (option) {
            case 0:
                return false;
            case 1:
                Shape newShape = new ShapesCreatorService().createNewShape();
                if (newShape != null) {
                    shapes.add(newShape);
                }
                break;
            case 2:
                listShapes();
                break;
            case 3:
                modifyShape();
                break;
            case 4:
                removeShape();
                break;
            default:
                System.out.println("You have chosen an invalid operation, Please try again :)");
        }
        return true;
    }

    private void listShapes() {
        System.out.println("====== LIST OF SHAPES ======");
        for (Shape s : shapes) {
            System.out.print((shapes.indexOf(s)+1)+"."+s.getName() + " with dimensions: ");
            System.out.print(s.listDimensions() + "; ");
            System.out.print("Area: " + s.calculateArea() + "; ");
            System.out.println("Perimeter: " + s.calculatePerimeter());
        }
        System.out.println("============================");
    }
    private void modifyShape() {
        if (shapes.isEmpty()) {
            System.out.println("\nShapes list is empty, try add some model and then modify them\n");
        } else {
            listShapes();
            System.out.println("Please choose the index of the shape you want to modify (1-" + shapes.size() + "): ");

            int index = ReaderService.INSTANCE.readInteger();
            try {
                Shape activeShape = shapes.get(index - 1);
                List<Double> oldDimensions = activeShape.listDimensions();
                Double oldPerimeter = activeShape.calculatePerimeter();
                Double oldArea = activeShape.calculateArea();

                System.out.print(activeShape.getName() + " with dimensions: ");
                System.out.print(oldDimensions + "; ");
                System.out.print("Area: " + oldArea + "; ");
                System.out.println("Perimeter: " + oldPerimeter);

                activeShape.modify();

                System.out.println("Old shape: ");
                System.out.print(activeShape.getName() + " with dimensions: ");
                System.out.print(oldDimensions + "; ");
                System.out.print("Area: " + oldArea + "; ");
                System.out.println("Perimeter: " + oldPerimeter);
                System.out.println("============================");
                System.out.println("New shape: ");
                System.out.print(activeShape.getName() + " with dimensions: ");
                System.out.print(activeShape.listDimensions() + "; ");
                System.out.print("Area: " + activeShape.calculateArea() + "; ");
                System.out.println("Perimeter: " + activeShape.calculatePerimeter());
                System.out.println("============================");
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nYou have chosen a figure that does not exist\n");
            }
        }
    }

    private void removeShape() {
        if (shapes.isEmpty()) {
            System.out.println("\nShapes list is empty\n");
        } else {
            try {
                listShapes();
                System.out.println("Please choose the index of the shape you want to remove (1-" + shapes.size() + "): ");
                int index = ReaderService.INSTANCE.readInteger();
                shapes.remove(index - 1);
                listShapes();
            } catch (IndexOutOfBoundsException e) {
                System.out.println("\nYou have chosen a figure that does not exist\n");
            }
        }
    }

}
