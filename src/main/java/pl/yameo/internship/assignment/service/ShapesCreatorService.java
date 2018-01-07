package pl.yameo.internship.assignment.service;

import pl.yameo.internship.assignment.model.*;


public class ShapesCreatorService {
    /**
     * Create a new instance of Shape depending of user choice.
     *
     * @return New instance of Shape or Null if chosen Shape does not exist.
     */
    public Shape createNewShape() {
        System.out.println("Choose shape to create:");
        for (Shapes shapes : Shapes.values()) {
            System.out.println(shapes.getShapeNumber() + ") " + shapes);
        }
        Shapes selectedShapes = Shapes.valueOf(ReaderService.INSTANCE.readInteger());
        Shape shape = null;
        if (selectedShapes != null) {
            try {
                shape = new ShapeFactory().getShape(selectedShapes);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }
        else{
            System.out.println("You have chosen invalid type of shape to create! Going back to main menu");
        }
        return shape;
    }
}