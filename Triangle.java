public class Triangle extends Shape {

    private Coordinates p1;
    private Coordinates p2;
    private Coordinates p3;

    public Triangle(Coordinates p1, Coordinates p2, Coordinates p3) {
        super(p1, 3);
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    private double sideA() {
        return p1.distance(p2);
    }

    private double sideB() {
        return p2.distance(p3);
    }

    private double sideC() {
        return p3.distance(p1);
    }

    @Override
    public double getPerimeter() {
        return sideA() + sideB() + sideC();
    }

    @Override
    public double getArea() {
        double a = sideA();
        double b = sideB();
        double c = sideC();
        double s = (a + b + c) / 2.0;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    @Override
    public void translate(int dx, int dy) {
        p1.translate(dx, dy);
        p2.translate(dx, dy);
        p3.translate(dx, dy);
    }

    @Override
    public void scale(int factor, boolean sign) {
        p1.scale(factor, sign);
        p2.scale(factor, sign);
        p3.scale(factor, sign);
    }

    @Override
    public String display() {
        return "Triangle\n"
                + "P1: " + p1.display()
                + "\nP2: " + p2.display()
                + "\nP3: " + p3.display()
                + "\nArea = " + getArea()
                + "\nPerimeter = " + getPerimeter();
    }
}
