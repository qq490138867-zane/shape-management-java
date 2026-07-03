public abstract class Shape {

    protected Coordinates position;
    protected int sides;

    public Shape(Coordinates position, int sides) {
        this.position = position;
        this.sides = sides;
    }

    public Coordinates getPosition() {
        return position;
    }

    public int getSides() {
        return sides;
    }

    public void translate(int dx, int dy) {
        position.translate(dx, dy);
    }

    public void scalePosition(int factor, boolean sign) {
        position.scale(factor, sign);
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void scale(int factor, boolean sign);

    public abstract String display();
}
