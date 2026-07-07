import java.util.ArrayList;

public class ShapeList {

    private ArrayList<Shape> shapes;

    public ShapeList() {
        shapes = new ArrayList<>();
    }

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void removeShape(int index) {
        if (index >= 0 && index < shapes.size()) {
            shapes.remove(index);
        } else {
            System.out.println("Invalid index.");
        }
    }

    public Shape getShape(int index) {
        if (index >= 0 && index < shapes.size()) {
            return shapes.get(index);
        }
        return null;
    }

    public int size() {
        return shapes.size();
    }

    public void displayAll() {
        if (shapes.isEmpty()) {
            System.out.println("No shapes available.");
            return;
        }

        for (int i = 0; i < shapes.size(); i++) {
            System.out.println("Shape " + (i + 1));
            System.out.println(shapes.get(i).display());
            System.out.println("--------------------");
        }
    }

    public void translateAll(int dx, int dy) {
        for (Shape shape : shapes) {
            shape.translate(dx, dy);
        }
    }

    public void scaleAll(int factor, boolean enlarge) {
        for (Shape shape : shapes) {
            shape.scale(factor, enlarge);
        }
    }
}
