public class Rectangle extends Shape {

    private double width;
    private double length;

    public Rectangle(Coordinates position, double width, double length) {
        super(position, 4);
        this.width = width;
        this.length = length;
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public double getPerimeter() {
        return 2 * (width + length);
    }

    @Override
    public void scale(int factor, boolean sign) {
        if (sign) {
            width *= factor;
            length *= factor;
        } else {
            width /= factor;
            length /= factor;
        }
        scalePosition(factor, sign);
    }

    @Override
    public String display() {
        return "Rectangle\n"
                + position.display()
                + "\nWidth = " + width
                + "\nLength = " + length
                + "\nArea = " + getArea()
                + "\nPerimeter = " + getPerimeter();
    }
}
