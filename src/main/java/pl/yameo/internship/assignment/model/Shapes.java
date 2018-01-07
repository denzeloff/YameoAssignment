package pl.yameo.internship.assignment.model;


public enum Shapes {
    ELLIPSE(1), RECTANGLE(2), CIRCLE(3), SQUARE(4), TRIANGLE(5), TRAPEZE(6);
    private int shapeNumber;

    Shapes(int shapeNumber) {
        this.shapeNumber = shapeNumber;
    }


    public static Shapes valueOf(Integer selectedShape) {
        for (Shapes shapes : Shapes.values()) {
            if (shapes.shapeNumber == selectedShape)
                return shapes;
        }
        return null;
    }

    public int getShapeNumber() {
        return shapeNumber;
    }
}

