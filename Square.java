public class Square extends Shape {

    private double side;

    public Square(Coordinates position, double side) {
        super(position, 4);
        this.side = side;
    }

    @Override
    public double getArea() {
        return side * side;
    }

    @Override
    public double getPerimeter() {
        return 4 * side;
    }

    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            side *= factor;
        } else {
            side /= factor;
        }
        scalePosition(factor, sign);
    }

    @Override
    public String display() {
        return "Square\n"
                + position.display()
                + "\nSide = " + side
                + "\nArea = " + getArea()
                + "\nPerimeter = " + getPerimeter();
    }
}
