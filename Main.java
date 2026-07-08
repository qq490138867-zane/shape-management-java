public class Main {
    public static void main(String[] args) {
        ShapeList shapeList = new ShapeList();

        Circle circle = new Circle(new Coordinates(2, 3), 5);
        Rectangle rectangle = new Rectangle(new Coordinates(1, 1), 4, 6);
        Square square = new Square(new Coordinates(0, 0), 3);
        Triangle triangle = new Triangle(
                new Coordinates(0, 0),
                new Coordinates(4, 0),
                new Coordinates(0, 3)
        );

        shapeList.addShape(circle);
        shapeList.addShape(rectangle);
        shapeList.addShape(square);
        shapeList.addShape(triangle);

        System.out.println("Original shapes:");
        shapeList.displayAll();

        System.out.println("After translating all shapes by 2, 2:");
        shapeList.translateAll(2, 2);
        shapeList.displayAll();

        System.out.println("After enlarging all shapes by factor 2:");
        shapeList.scaleAll(2, true);
        shapeList.displayAll();

        System.out.println("After removing shape at index 1:");
        shapeList.removeShape(1);
        shapeList.displayAll();

        System.out.println("Trying to remove invalid index:");
        shapeList.removeShape(100);

        System.out.println("Testing empty shape list:");
        ShapeList emptyList = new ShapeList();
        emptyList.displayAll();
    }
}
