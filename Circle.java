public class Circle extends Shape {

    private double radius;

    public Circle(Coordinates position, double radius) {
        super(position, 0);
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            radius *= factor;
        } else {
            radius /= factor;
        }
        scalePosition(factor, sign);
    }

    @Override
    public String display() {
        return "Circle\n"
                + position.display()
                + "\nRadius = " + radius
                + "\nArea = " + getArea()
                + "\nPerimeter = " + getPerimeter();
    }
}
